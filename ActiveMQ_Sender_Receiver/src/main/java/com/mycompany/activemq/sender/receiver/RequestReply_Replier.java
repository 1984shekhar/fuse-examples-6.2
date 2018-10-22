package com.mycompany.activemq.sender.receiver;

import java.util.Hashtable;
import javax.jms.*;
import javax.management.RuntimeErrorException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.apache.activemq.ActiveMQConnectionFactory;
class RequestReply_Replier {
	 private QueueConnectionFactory cf = null;
	 private Connection connection = null;
	 private Session session = null;
	 private Destination reqQ = null;
	 private Destination repQ = null;
	 private MessageProducer producer = null;
	 private MessageConsumer consumer = null;
       
       public void processMessage() {
    	   
            Connection connection = null;
            Session session = null;
            Destination reqQ = null;
            Destination repQ = null;
            MessageProducer producer = null;
            MessageConsumer consumer = null;
            
            try {
              // Create a connection factory
              cf = new ActiveMQConnectionFactory("tcp://localhost:61616");
              // Create JMS objects
              connection = cf.createConnection("admin","admin");
              session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
              reqQ = session.createQueue("queue:///REQUESTQ");
          
              // Create consumer to read requests
              consumer = session.createConsumer(reqQ);

              // Start the connection
              connection.start();

              // Loop to read requests and respond
              while(true){
              Message receivedMessage = consumer.receive(35000);
              if(receivedMessage != null){
                  System.out.println("\nResponder received message:\n" + receivedMessage);
                  repQ = receivedMessage.getJMSReplyTo();
                  producer = session.createProducer(repQ);
                  Message requestMessage = session.createTextMessage("Responder service");
                  requestMessage.setJMSCorrelationID(receivedMessage.getJMSMessageID());
                  producer.send(requestMessage);
              }
              else
                  System.out.println("No message received");
              }
            }catch(Exception ex){
                System.out.println(ex);
            }
       }

    


    public static void main(String[] args) {
        // TODO Auto-generated method stub             
        RequestReply_Replier rep = new RequestReply_Replier();
        rep.processMessage();
    }
    }