package org.jboss.fuse.samples.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.camel.example.reportincident.InputReportIncident;

public class MyProcessor implements Processor  {
    final static Logger logger = LoggerFactory.getLogger(MyProcessor.class);

    @Override 
    public void process(Exchange exchange) throws Exception { 
        InputReportIncident input = new InputReportIncident();
        input.setIncidentId("123");
        input.setIncidentDate("2008-08-18");
        input.setGivenName("Claus");
        input.setFamilyName("Ibsen");
        input.setSummary("Bla");
        input.setDetails("Bla bla");
        input.setEmail("davsclaus@apache.org");
        input.setPhone("0045 2962 7576");
        exchange.getIn().setBody(input);
    } 
} 
