

Pass below as argument:

tcp://localhost:61616

For selector create Queue:
MY.QUEUE and FOO in activemq. 
If we set msg.setStringProperty("criteria", "B"); in producer than message will be forwarded to queue FOO else it will be lost.

Selector Filter with broker configuration:

<destinationInterceptors>
      <virtualDestinationInterceptor>
        <virtualDestinations>
          <compositeQueue name="MY.QUEUE">
            <forwardTo>
              <filteredDestination selector="criteria = 'B'" queue="FOO"/>
              <filteredDestination topic="BAR"/>
            </forwardTo>
          </compositeQueue>
        </virtualDestinations>
      </virtualDestinationInterceptor>
    </destinationInterceptors>

    
    
For QueueReceive_Artemis, broker.xml should have:
 <address name="TestA">
   <anycast>
      <queue name="TestB" />
   </anycast>
 </address>
 
 
 #Run using maven commandline, in pom.xml there is a plugin exec-maven-plugin.
 
 mvn exec:java -D"exec.mainClass"="com.mycompany.activemq.sender.receiver.TopicReceive" -D"exec.args"="tcp://10.74.254.116:61616"
