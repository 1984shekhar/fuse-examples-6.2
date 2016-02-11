Camel Router Project for Spring-DM (OSGi)
=========================================

To build this project use

    mvn install

You can run this project using he following Maven goal:

    mvn camel:run

To deploy the project in OSGi. For example using Apache ServiceMix
or Apache Karaf. You will run the following command from its shell:

    osgi:install -s mvn:com.mycompany/esper-test/1.0.0-SNAPSHOT
    
install -s wrap:mvn:org.antlr/antlr/3.4
install -s wrap:mvn:cglib/cglib-nodep/2.2
install -s wrap:mvn:org.antlr/antlr-runtime/3.3
install -s wrap:mvn:com.espertech/esper/4.7.0
install -s wrap:file:/home/cpandey/NotBackedUp/Downloads/aspectjweaver-1.7.2.jar

For more help see the Apache Camel documentation

    http://camel.apache.org/

    