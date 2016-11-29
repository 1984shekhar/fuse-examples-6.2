package com.mycompany.test.blueprint;

import java.util.List;
import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.component.sql.SqlComponent;
import org.apache.camel.component.sql.SqlEndpoint;
import org.apache.camel.test.blueprint.CamelBlueprintTestSupport;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;



public class RouteTest extends CamelBlueprintTestSupport {
	
	 private EmbeddedDatabase db;

	    @Before
	    public void setUp() throws Exception {
	    	System.out.println("[TEST-Mediacion] pre bd");
	        db = new EmbeddedDatabaseBuilder()
	                .setType(EmbeddedDatabaseType.DERBY).addScript("sql/createAndPopulateDatabase.sql").build();
	        super.setUp();
	    }
	    @After
	    public void tearDown() throws Exception {
	        super.tearDown();

	        db.shutdown();
	    }
	
    @Override
    protected String getBlueprintDescriptor() {
        return "OSGI-INF/blueprint/blueprint.xml";
    }

    @Test
    public void testRoute() throws Exception {
        // the route is timer based, so every 5th second a message is send
        // we should then expect at least one message
   /* 	Thread.sleep(5000);
    	System.out.println(getMockEndpoint("mock:result").getReceivedExchanges().get(0).getIn().getBody());
    	getMockEndpoint("mock:result").expectedMinimumMessageCount(1);
    	 assertTrue(true);*/
    	
    	
 
    	 /*List<?> received = assertIsInstanceOf(List.class, getMockEndpoint("mock:result").getReceivedExchanges().get(0).getIn().getBody());
    	 System.out.println("Received: "+ received.get(0));*/
    	
    	/*MockEndpoint mock = getMockEndpoint("mock:result");
        mock.expectedMessageCount(1);

        template.sendBody("direct:simple", "XXX");

        mock.assertIsSatisfied();

        // the result is a List
        List<?> received = assertIsInstanceOf(List.class, mock.getReceivedExchanges().get(0).getIn().getBody());

        // and each row in the list is a Map
        System.out.println("Recieved :"+received.get(0));
        Map<?, ?> row = assertIsInstanceOf(Map.class, received.get(0));

        // and we should be able the get the project from the map that should be Linux
        assertEquals("Linux", row.get("PROJECT"));*/
    	/*Thread.sleep(5000);
    	System.out.println(getMockEndpoint("mock:result").getReceivedExchanges().get(0).getIn().getBody());*/
    	//template.sendBody("direct:simple", "XXX");
    	Thread.sleep(2000);
    	MockEndpoint mock = getMockEndpoint("mock:result");
    	mock.expectedMessageCount(1);

    	List<Exchange> list = mock.getReceivedExchanges();
    	for(Exchange e:list){
    		System.out.println("Body..................."+e.getIn().getBody().toString());
    	}
    	
    	assertMockEndpointsSatisfied();
    }

    
    @Override
    protected RouteBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
            @Override
            public void configure() throws Exception {
            	//El componente SQL ahora apunta a la BD en memoria! No al H2!
            	SqlEndpoint sql = new SqlEndpoint();
                sql.setCamelContext(context);
                sql.setJdbcTemplate(new JdbcTemplate(db));
                sql.setQuery("select * from projects");

                context.addEndpoint("mysql", sql);

                //getContext().getComponent("sql", SqlComponent.class).setDataSource(db);
            }
        };
    }
}
