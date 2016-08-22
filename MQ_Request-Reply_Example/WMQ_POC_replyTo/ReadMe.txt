Camel Router Project for Blueprint (OSGi)
=========================================

To build this project use

    mvn install

To run the project you can execute the following Maven goal

    mvn camel:run

To deploy the project in OSGi. For example using Apache ServiceMix
or Apache Karaf. You can run the following command from its shell:

1)    osgi:install -s mvn:com.mycompany/WMQ_POC_replyTo/1.0.0-SNAPSHOT

2)	Copy TestSoap.txt to folder set in 'file:...' uri
 
 
 For more help see the Apache Camel documentation

    http://camel.apache.org/



    