package com.mycompany.camel.blueprint;
import java.io.File;

import javax.activation.DataHandler;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.RequestEntity;
import org.apache.commons.httpclient.methods.multipart.FilePart;
import org.apache.commons.httpclient.methods.multipart.MultipartRequestEntity;
import org.apache.commons.httpclient.methods.multipart.Part;
import org.apache.commons.httpclient.methods.multipart.StringPart;
import org.apache.commons.httpclient.params.HttpMethodParams;
import org.junit.Test;

public class MultiPartFormTest extends CamelTestSupport {
    private RequestEntity createMultipartRequestEntity() throws Exception {
        File file = new File("/home/cpandey/NotBackedUp/Downloads/Test.txt");

        Part[] parts = {new StringPart("comment", "A binary file of some kind"),
                        new FilePart(file.getName(), file)};

        return new MultipartRequestEntity(parts, new HttpMethodParams());

    }

    @Test
    public void testSendMultiPartForm() throws Exception {
        HttpClient httpclient = new HttpClient();

        PostMethod httppost = new PostMethod("http://0.0.0.0:9999/ConnectivityService/bandwidthTestUpload");
        
        httppost.setRequestEntity(createMultipartRequestEntity());

        int status = httpclient.executeMethod(httppost);

        assertEquals("Get a wrong response status", 200, status);
        String result = httppost.getResponseBodyAsString();

        assertEquals("Get a wrong result", "A binary file of some kind", result);

    }
/*
    @Test
    public void testSendMultiPartFormFromCamelHttpComponnent() throws Exception {
        String result = template.requestBody("http://localhost:9091"+ "/test", createMultipartRequestEntity(), String.class);
        assertEquals("Get a wrong result", "A binary file of some kind", result);
    }
*/
    /*protected RouteBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
            public void configure() throws Exception {
                // START SNIPPET: e1
                // Set the jetty temp directory which store the file for multi
                // part form
                // camel-jetty will clean up the file after it handled the
                // request.
                // The option works rightly from Camel 2.4.0
                getContext().getProperties().put("CamelJettyTempDir", "target");

                from("jetty://http://localhost:9091/test").process(new Processor() {

                    public void process(Exchange exchange) throws Exception {
                        Message in = exchange.getIn();
                        assertEquals("Get a wrong attachement size", 1, in.getAttachments().size());
                        // The file name is attachment id
                        DataHandler data = in.getAttachment("NOTICE.txt");

                        assertNotNull("Should get the DataHandle NOTICE.txt", data);
                        // This assert is wrong, but the correct content-type
                        // (application/octet-stream)
                        // will not be returned until Jetty makes it available -
                        // currently the content-type
                        // returned is just the default for FileDataHandler (for
                        // the implentation being used)
                        // assertEquals("Get a wrong content type",
                        // "text/plain", data.getContentType());
                        assertEquals("Got the wrong name", "NOTICE.txt", data.getName());

                        assertTrue("We should get the data from the DataHandle", data.getDataSource()
                            .getInputStream().available() > 0);

                        // The other form date can be get from the message
                        // header
                        exchange.getOut().setBody(in.getHeader("comment"));
                    }

                });
                // END SNIPPET: e1
            }
        };
    }*/

}