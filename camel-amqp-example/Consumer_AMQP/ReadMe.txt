Camel Router Project for Blueprint (OSGi)
=========================================

To build this project use

    mvn install

To run the project you can execute the following Maven goal

    mvn camel:run

To deploy the project in OSGi. For example using Apache ServiceMix
or Apache Karaf. You can run the following command from its shell:

    osgi:install -s mvn:com.mycompany/amqp-consumer/1.0.0-SNAPSHOT

For more help see the Apache Camel documentation

    http://camel.apache.org/
osgi:install -s wrap:mvn:org.apache.qpid/proton-j/0.9.1
osgi:install -s wrap:mvn:io.netty/netty-all/4.0.17.Final
osgi:install -s mvn:org.apache.camel/camel-amqp/2.15.1.redhat-621084
osgi:install -s wrap:mvn:org.apache.qpid/qpid-jms-client/0.2.0
osgi:install -s mvn:com.mycompany/amqp-producer/1.0.0-SNAPSHOT
osgi:install -s mvn:com.mycompany/amqp-consumer/1.0.0-SNAPSHOT
    