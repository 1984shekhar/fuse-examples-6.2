Camel Router Project for Blueprint (OSGi)
=========================================

To build this project use

    mvn install

To run the project you can execute the following Maven goal

    mvn camel:run

To deploy the project in OSGi. For example using Apache ServiceMix
or Apache Karaf. You can run the following command from its shell:

    osgi:install -s mvn:com.mycompany/test-profile/1.0

For more help see the Apache Camel documentation

    http://camel.apache.org/

Request can be send as:

curl -H "Content-Type: application/json" -d '{"name":"xyz","id":"xyz123"}' http://localhost:9091/cbr-web-services/rest/itineraries
