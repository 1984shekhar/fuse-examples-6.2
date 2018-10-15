package com.mycompany.activemq.sender.receiver;

import java.util.Hashtable;
import javax.jms.*;
import javax.management.RuntimeErrorException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.apache.activemq.ActiveMQConnectionFactory;

public class QueueReceive_Artemis implements MessageListener
{

//public final static String JNDI_FACTORY="org.apache.activemq.artemis.jndi.ActiveMQInitialContextFactory";
public final static String JNDI_FACTORY="org.apache.activemq.jndi.ActiveMQInitialContextFactory";
//*************** Connection Factory JNDI name *************************
public final static String JMS_FACTORY="ConnectionFactory";
//*************** Queue JNDI name *************************
public final static String QUEUE="TestA::TestB";
private QueueConnectionFactory qconFactory;
private Connection qcon;
private Session qsession;
private QueueReceiver qreceiver;
private MessageConsumer qconsumer;
private Queue queue;
private boolean quit = false;
public void onMessage(Message msg)
{
	try {
		Thread.sleep(5000);
		System.out.println("Within onMessage....");
		String msgText;
		if (msg instanceof TextMessage)
			{
			msgText = ((TextMessage)msg).getText();
			}
		else
			{
			msgText = msg.toString();
			}
			System.out.println("Msg_Receiver "+ msgText );
			//qsession.rollback();
			
		if (msgText.equalsIgnoreCase("quit"))
			{
			synchronized(this)
				{
				quit = true;
				this.notifyAll(); // Notify main thread to quit
				}
		}
	}
	catch (Exception jmse)
	{
	
	jmse.printStackTrace();
	}

}
public void init(Context ctx) throws NamingException, JMSException
{
//qconFactory = (QueueConnectionFactory) ctx.lookup(JMS_FACTORY);
qconFactory  = new ActiveMQConnectionFactory();
	
qcon = qconFactory.createConnection("admin","admin");
qsession = qcon.createSession(true, Session.AUTO_ACKNOWLEDGE);

//queue = (Queue) ctx.lookup("TestA::TestB");
queue = qsession.createQueue(QUEUE);
qconsumer = qsession.createConsumer(queue);
qconsumer.setMessageListener(this);

qcon.start();
	
/*	ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory("admin","admin","tcp://localhost:61616");
	 connectionFactory.getRedeliveryPolicy().setMaximumRedeliveries(0);
    // Create a Connection
	 qcon = (QueueConnection) connectionFactory.createConnection();
	 qsession = qcon.createQueueSession(true, Session.CLIENT_ACKNOWLEDGE);
	 queue = (Queue) ctx.lookup(queueName);
	 qreceiver = qsession.createReceiver(queue);
	 qreceiver.setMessageListener(this);
	 qcon.start();*/
 
    // Receive a message with the JMS API

}
public void close()throws JMSException
{
qconsumer.close();
qsession.close();
qcon.close();
}
public static void main(String[] args) throws Exception
{
if (args.length != 1)
{
System.out.println("Usage: java QueueReceive URL");
return;
}
InitialContext ic = getInitialContext(args[0]);
QueueReceive_Artemis qr = new QueueReceive_Artemis();
qr.init(ic);
System.out.println("JMS Ready To Receive Messages (To quit, send a  message from QueueSender.class).");
// Wait until a "quit" message has been received.
synchronized(qr)
{
while (! qr.quit)
{
try
{
qr.wait();
}
catch (InterruptedException ie)
{}
}
}
qr.close();
}
private static InitialContext getInitialContext(String url) throws NamingException
{
Hashtable env = new Hashtable();
env.put(Context.INITIAL_CONTEXT_FACTORY, JNDI_FACTORY);
env.put(Context.PROVIDER_URL, url);
return new InitialContext(env);
}
}
