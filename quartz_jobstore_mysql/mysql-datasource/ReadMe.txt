Camel Router Project for Blueprint (OSGi)
=========================================

To build this project use

    mvn install

To run the project you can execute the following Maven goal

    mvn camel:run

To deploy the project in OSGi. For example using Apache ServiceMix
or Apache Karaf. You can run the following command from its shell:

features:install jndi
osgi:install -s mvn:org.apache.servicemix.bundles/org.apache.servicemix.bundles.commons-dbcp/1.4_3
osgi:install -s wrap:file:/home/cpandey/NotBackedUp/Development/OracleDriver/ojdbc6-11.2.0.2.0.jar
osgi:install -s mvn:com.mycompany/oracle-datasource/1.0.0-SNAPSHOT

For more help see the Apache Camel documentation

    http://camel.apache.org/
