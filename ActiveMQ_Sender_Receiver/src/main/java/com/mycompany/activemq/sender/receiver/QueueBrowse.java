package com.mycompany.activemq.sender.receiver;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import javax.jms.*;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import org.apache.activemq.command.*;

public class QueueBrowse
{
  public final static String JNDI_FACTORY="org.apache.activemq.jndi.ActiveMQInitialContextFactory";
  public final static String JMS_FACTORY="ConnectionFactory";
  public final static String QUEUE="dynamicQueues/12345";
  public final static String username="admin";
  public final static String password="admin";

  private QueueConnectionFactory qconFactory;
  private QueueConnection qcon;
  private QueueSession qsession;
  private QueueBrowser qbrowser;
  private Queue queue;

  static int i=0;

  public void init(Context ctx, String queueName) throws NamingException, JMSException
  {
    qconFactory = (QueueConnectionFactory) ctx.lookup(JMS_FACTORY);
    qcon = qconFactory.createQueueConnection("admin","admin");
    qsession = qcon.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);
    queue = (Queue) ctx.lookup(queueName);
    qbrowser = qsession.createBrowser(queue);
    qcon.start();

//ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory("vm://localhost");
  }

  public void displayQueue() throws JMSException {
    Enumeration e = qbrowser.getEnumeration();
    
    ActiveMQMessage mqMessage = new ActiveMQMessage(); 
    if (! e.hasMoreElements()) {
      System.out.println("There are no messages on this queue.");
    } else {
      System.out.println("Queued JMS Messages: ");
      
      while (e.hasMoreElements()) {
        
        mqMessage = (ActiveMQMessage) e.nextElement();
        i++;
        System.out.println("Message ID " + mqMessage.getJMSMessageID() +" delivered " + new Date(mqMessage.getJMSTimestamp()) +" to " + mqMessage.getJMSDestination());
        System.out.print("\tExpires        ");

        if (mqMessage.getJMSExpiration() > 0) {
          System.out.println( new Date( mqMessage.getJMSExpiration()));
        }
        else {
          System.out.println("never");
        }

        System.out.println("\tPriority       " + mqMessage.getJMSPriority());
        System.out.println("\tMode           " + (mqMessage.getJMSDeliveryMode() == DeliveryMode.PERSISTENT ?"PERSISTENT" : "NON_PERSISTENT"));
        System.out.println("\tCorrelation ID " + mqMessage.getJMSCorrelationID());
        System.out.println("\tReply to       " + mqMessage.getJMSReplyTo());
        System.out.println("\tMessage type   " + mqMessage.getJMSType());
        System.out.println("\tJMSActiveMQBrokerInTime  " + new Date(Long.valueOf(""+mqMessage.getObjectProperty("JMSActiveMQBrokerInTime"))));
        System.out.println("\tJMSActiveMQBrokerOutTime  " + mqMessage.getObjectProperty("JMSActiveMQBrokerOutTime"));
        if (mqMessage instanceof TextMessage) {
          System.out.println("\tTextMessage    \"" +((TextMessage)mqMessage).getText() + "\"");
        }
      }
    }
  }

  public void close() throws JMSException {
    qbrowser.close();
    qsession.close();
    qcon.close();
  }

  public static void main(String[] args) throws Exception  {
    if (args.length != 1) {
      System.out.println("Usage: java QueueBrowse JBossURL");
      return;
    }
    InitialContext ic = getInitialContext(args[0]);
    QueueBrowse qb = new QueueBrowse();
    qb.init(ic, QUEUE);
    qb.displayQueue();
    System.out.println("");
    System.out.println("");
    System.out.println("***Number of Messages in ["+QUEUE+"] ===> "+i);
    System.out.println("");
    System.out.println("");
    qb.close();
  }

  private static InitialContext getInitialContext(String url)
    throws NamingException
  {
    Hashtable<String,String> env = new Hashtable<String,String>();
    env.put(Context.INITIAL_CONTEXT_FACTORY, JNDI_FACTORY);
    env.put(Context.PROVIDER_URL, url);
    env.put(Context.SECURITY_PRINCIPAL, "admin");
    env.put(Context.SECURITY_CREDENTIALS, "admin");
    return new InitialContext(env);
  }
}
