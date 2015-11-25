Camel Router Project for Blueprint (OSGi)
=========================================

To build this project use

    mvn install

To run the project you can execute the following Maven goal

    mvn camel:run

To deploy the project in OSGi. For example using Apache ServiceMix
or Apache Karaf. You can run the following command from its shell:

    osgi:install -s wrap:file:/path/to/postgresql-9.0-801.jdbc4.jar
    osgi:install -s mvn:com.mycompany/PostGreSqlTest/1.0.0-SNAPSHOT

For more help see the Apache Camel documentation

    http://camel.apache.org/
