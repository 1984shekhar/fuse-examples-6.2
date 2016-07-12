package com.mycompany.camel.blueprint.velocity;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.component.velocity.VelocityConstants;
import org.apache.velocity.VelocityContext;

/**
 * A bean which we use in the route
 */
public class HelloBean {

    public void hello(Exchange exchange) {
    	exchange.getIn().setBody("");
        exchange.getIn().setHeader("name", "Christian");
        Map<String, Object> variableMap = new HashMap<String, Object>();
        Map<String, Object> headersMap = new HashMap<String, Object>();
        headersMap.put("name", "Willem");
        variableMap.put("headers", headersMap);
        variableMap.put("body", "Monday");
        variableMap.put("exchange", exchange);
        VelocityContext velocityContext = new VelocityContext(variableMap);
        exchange.getIn().setHeader(VelocityConstants.VELOCITY_CONTEXT, velocityContext);
        exchange.setProperty("item", "7");
    }

}
