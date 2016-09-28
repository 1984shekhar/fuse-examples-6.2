=================
Configuring Maven
=================

To run the examples from a binary release (zip or RPM), it is first necessary to
configure Maven to utilise the provided maven repository files for the client.
This is done by updating the Maven settings.xml file. Example configuration
settings and further instructions for using them can be found in the
example-settings.xml file.

===========================
Running the client examples
===========================

Use maven to build the module, and additionally copy the dependencies
alongside their output:

  mvn clean package dependency:copy-dependencies -DincludeScope=runtime -DskipTests

Now you can run the examples using commands of the format:

  Linux:   java -cp "target/classes/:target/dependency/*" org.apache.qpid.jms.example.HelloWorld

  Windows: java -cp "target\classes\;target\dependency\*" org.apache.qpid.jms.example.HelloWorld

NOTE: The examples expect to use a Queue named "queue". You may need to create
this before running the examples, depending on the broker/peer you are using.

NOTE: You can configure the connection and queue details used by updating the
JNDI configuration file before building. It can be found at:
src/main/resources/jndi.properties

NOTE: The earlier build command will cause Maven to resolve the client artifact
dependencies against its local and remote repositories. If you wish to use a
locally-built client, ensure to "mvn install" it in your local repo first.



Here Send and ReceiveAmqp classes to send and receive AMQP message using AMQP protocol. Headers like Content-Type can be fetched.

While Sender and Receiver classes send and receive AMQP message in JMS protocol. So headers like Content-Type are no available.

To run Send and ReceiveAmqp classes, in Fuse/AMQ disable:
<plugins>
    <!-- <jaasAuthenticationPlugin configuration="karaf" />
     <authorizationPlugin>
     ----
     </authorizationPlugin> -->
</plugins>

Stop Fuse and Clear cache folder. Start Fuse now.
Send messages.