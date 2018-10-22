package com.mycompany.activemq.sender.receiver;
import javax.jms.Connection;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageProducer;
import javax.jms.QueueConnectionFactory;
import javax.jms.Session;
import javax.naming.Context;
import javax.naming.NamingException;

import org.apache.activemq.ActiveMQConnectionFactory;

/*
 * Implementation of requester class
 */
class Requestor {
	 private QueueConnectionFactory cf = null;
	 private Connection connection = null;
	 private Session session = null;
	 private Destination reqQ = null;
	 private Destination repQ = null;
	 private MessageProducer producer = null;
	 private MessageConsumer consumer = null;
	 private boolean quit = false;
     //public final static String JNDI_FACTORY="org.apache.activemq.artemis.jndi.ActiveMQInitialContextFactory";
       public final static String JNDI_FACTORY="org.apache.activemq.jndi.ActiveMQInitialContextFactory";
       //*************** Connection Factory JNDI name *************************
       public final static String JMS_FACTORY="ConnectionFactory";      
       public void processMessage() {
    	  
            
            try {
              // Create a connection factory
              
              cf = new ActiveMQConnectionFactory("tcp://localhost:61616");
              // Create JMS objects
              connection = cf.createConnection("admin","admin");
              session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
              
              // Create destination to send requests
              reqQ = session.createQueue("queue:///REQUESTQ");
              // Create destination to read replies
              repQ = session.createQueue("queue:///REPLYQ");
              
              // Create producer
              producer = session.createProducer(reqQ);
              
              // Create a request message
              Message requestMessage = session.createTextMessage("Requesting a service");
              // Tell the responder where to put replies.
              requestMessage.setJMSReplyTo(repQ);
              // Send it off
              producer.send(requestMessage);
              
              // Get only that reply that matches my request message id.
              String selector = "JMSCorrelationID='" + requestMessage.getJMSMessageID()+"'";
              
              // Create consumer with selector
              consumer = session.createConsumer(repQ, selector);

              // Start the connection
              connection.start();

              // Get the message
              Message receivedMessage = consumer.receive(35000);
              if(receivedMessage != null)
                  System.out.println("\nRequestor received message:\n" + receivedMessage);
              else
                  System.out.println("No message received");
            }catch(Exception ex){
                System.out.println(ex);
            }
       }
       
       // Start thread
       public static void main(String[] args) throws Exception
       {
       if (args.length != 1)
       {
       System.out.println("Usage: java QueueReceive URL");
       return;
       }
       //InitialContext ic = getInitialContext(args[0]);
       Requestor qr = new Requestor();
     //  qr.init(ic);
       qr.processMessage();
       System.out.println("JMS Ready To Receive Messages (To quit, send a  message from QueueSender.class).");
       // Wait until a "quit" message has been received.
   
       qr.close();
       }
       
       public void close()throws JMSException
       {
       consumer.close();
       session.close();
       connection.close();
       }
       
       public void init(Context ctx) throws NamingException, JMSException
       {
       //qconFactory = (QueueConnectionFactory) ctx.lookup(JMS_FACTORY);
    /*	   cf  = new ActiveMQConnectionFactory();
       qcon = qconFactory.createConnection("admin","admin");
       qsession = qcon.createSession(true, Session.AUTO_ACKNOWLEDGE);

       //queue = (Queue) ctx.lookup("TestA::TestB");
       queue = qsession.createQueue(QUEUE);
       qconsumer = qsession.createConsumer(queue);
       qconsumer.setMessageListener(this);

       qcon.start();*/
       	
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
  /*     private static InitialContext getInitialContext(String url) throws NamingException
       {
       Hashtable env = new Hashtable();
       env.put(Context.INITIAL_CONTEXT_FACTORY, JNDI_FACTORY);
       env.put(Context.PROVIDER_URL, url);
       return new InitialContext(env);
       }
*/
    }
