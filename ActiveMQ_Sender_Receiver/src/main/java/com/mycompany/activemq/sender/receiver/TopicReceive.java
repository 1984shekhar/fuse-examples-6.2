package com.mycompany.activemq.sender.receiver;

import java.io.*;
import java.util.*;
import javax.transaction.*;
import javax.naming.*;
import javax.jms.*;
import javax.rmi.PortableRemoteObject;
public class TopicReceive implements MessageListener {
public final static String JNDI_FACTORY="org.apache.activemq.jndi.ActiveMQInitialContextFactory";
//*************** Connection Factory JNDI name *************************
public final static String JMS_FACTORY="ConnectionFactory";
//*************** Queue JNDI name *************************
public final static String TOPIC="dynamicTopics/TestT";
private TopicConnectionFactory tconFactory;
private TopicConnection tcon;
private TopicSession tsession;
private TopicSubscriber tsubscriber;
private Topic topic;
private boolean quit = false;

public void onMessage(Message msg)
{
try {
String msgText;
if (msg instanceof TextMessage) {
msgText = ((TextMessage)msg).getText();
} else {
msgText = msg.toString();
}
System.out.println("JMS Message Received: "+ msgText );
if (msgText.equalsIgnoreCase("quit")) {
synchronized(this) {
quit = true;
this.notifyAll();
}
}
} catch (JMSException jmse) {
System.err.println("An exception occurred: "+jmse.getMessage());
}
}

public void init(Context ctx, String topicName)throws NamingException, JMSException
{
tconFactory = (TopicConnectionFactory)PortableRemoteObject.narrow(ctx.lookup(JMS_FACTORY), TopicConnectionFactory.class);
tcon = tconFactory.createTopicConnection("admin","admin");
tcon.setClientID("DurableSubscriberExample1");
tsession = tcon.createTopicSession(false, Session.AUTO_ACKNOWLEDGE);
topic = (Topic) PortableRemoteObject.narrow(ctx.lookup(topicName), Topic.class);
tsubscriber = tsession.createDurableSubscriber(topic, "subscriber2");
//tsubscriber = tsession.createSubscriber(topic);
tsubscriber.setMessageListener(this);
tcon.start();
}

public void close() throws JMSException {
tsubscriber.close();
tsession.close();
tcon.close();
}

public static void main(String[] args) throws Exception {
if (args.length != 1) {
System.out.println("Usage: java examples.jms.topic.TopicReceive WebLogicURL");
return;
}
InitialContext ic = getInitialContext(args[0]);
TopicReceive tr = new TopicReceive();
tr.init(ic, TOPIC);
System.out.println("JMS Ready To Receive Messages (To quit, send a \"quit\" message).");
synchronized(tr) {
while (! tr.quit) {
try {
tr.wait();
} catch (InterruptedException ie) {}
}
}
tr.close();
}

private static InitialContext getInitialContext(String url) throws NamingException
{
Hashtable<String,String> env = new Hashtable<String,String>();
env.put(Context.INITIAL_CONTEXT_FACTORY, JNDI_FACTORY);
env.put(Context.PROVIDER_URL, url);


return new InitialContext(env);
}
}

