

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
