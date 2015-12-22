Camel Router Project for Spring-DM (OSGi)
=========================================

To build this project use

    mvn install

You can run this project using he following Maven goal:

    mvn camel:run

To deploy the project in OSGi. For example using Apache ServiceMix
or Apache Karaf. You will run the following command from its shell:

    osgi:install -s wrap:file:/home/cpandey/NotBackedUp/Development/OracleDriver/ojdbc6-11.2.0.2.0.jar
	features:install jpa
    features:install jndi
    features:install hibernate
	osgi:install -s mvn:org.apache.servicemix.bundles/org.apache.servicemix.bundles.commons-dbcp/1.4_3
    osgi:install -s mvn:com.mycompany/spring-datasource/1.0.0-SNAPSHOT

For more help see the Apache Camel documentation

    http://camel.apache.org/
