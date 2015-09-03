Camel Router Project for Blueprint (OSGi)
=========================================

To build this project use

    mvn install

To run the project you can execute the following Maven goal

    mvn camel:run

To deploy the project in OSGi. For example using Apache ServiceMix
or Apache Karaf. You can run the following command from its shell:

    osgi:install -s mvn:com.mycompany/camel-blueprint-salesforce-6.2/1.0.0-SNAPSHOT



[1]https://developer.salesforce.com/docs/atlas.en-us.apexcode.meta/apexcode/apex_qs_customobject.htm
[2]http://camel.apache.org/salesforce.html#Salesforce-RestAPI
