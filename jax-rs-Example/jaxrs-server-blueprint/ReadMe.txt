Camel Router Project for Blueprint (OSGi)
=========================================

To build this project use

    mvn clean install


To deploy the project in OSGi. For example using Apache ServiceMix
or Apache Karaf. You can run the following command from its shell:

    osgi:install -s mvn:com.mycompany.example/jaxrsExampleService/1.0.0-SNAPSHOT
http://localhost:9000/testREST/customerservice/customers/123
    
    
This project is simple example of cxf REST webservice, which provides operation getCustomer. If customer-id is provided in request, it gives customer detail as output.

It can be tested using soap-ui after creating REST project with url http://localhost:9000/?_wadl. Before this bundle should be deployed in Fuse.

Or it can also be tested using a REST client and providing the customer-id as input.