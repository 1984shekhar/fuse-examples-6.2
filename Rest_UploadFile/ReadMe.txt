Camel Router Project for Blueprint (OSGi)
=========================================

To build this project use

    mvn install

To run the project you can execute the following Maven goal

    mvn camel:run

To deploy the project in OSGi. For example using Apache ServiceMix
or Apache Karaf. You can run the following command from its shell:

    osgi:install -s mvn:com.mycompany/rest-file-upload/1.0

For more help see the Apache Camel documentation

    http://camel.apache.org/

Get:
curl http://localhost:8181/cxf/crm/customerservice/customers/123

POST:
curl -X POST -T /path/to/Rest_Simple_Post_Get/src/test/resources/add_customer.xml -H "Content-Type: application/xml" http://localhost:8181/cxf/crm/customerservice/customers

Upload File:curl -v -F upfile=@/path/to/Rest_UploadFile/src/test/resources/add_customer.xml http://localhost:8181/cxf/crm/customerservice/upload

Note:@/path/to/...., for testing we should prefix path with @.

