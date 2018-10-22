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
class RequestReply_Requestor {
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
              reqQ = session.createQueue("REQUESTQ");
              // Create destination to read replies
              repQ = session.createQueue("REPLYQ");
              
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
       RequestReply_Requestor qr = new RequestReply_Requestor();
       qr.processMessage();
       //System.out.println("JMS Ready To Receive Messages (To quit, send a  message from QueueSender.class).");
       // Wait until a "quit" message has been received.
   
       qr.close();
       }
       
       public void close()throws JMSException
       {
       consumer.close();
       session.close();
       connection.close();
       }
    }
