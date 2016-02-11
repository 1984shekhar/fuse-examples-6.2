package com.cor.cep;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cor.cep.util.RandomTemperatureEventGenerator;

/**
 * Entry point for the Demo. Run this from your IDE, or from the command line
 * using 'mvn exec:java'.
 */
public class StartDemo {

	/** Logger */

	private static Logger LOG = LoggerFactory.getLogger(StartDemo.class);
	RandomTemperatureEventGenerator generator;
	public RandomTemperatureEventGenerator getGenerator() {
		return generator;
	}

	public void setGenerator(RandomTemperatureEventGenerator generator) {
		this.generator = generator;
	}

	/**
	 * Main method - start the Demo!
	 */
	public void test() throws Exception {

	/*	ClassLoader cl1 = Thread.currentThread().getContextClassLoader();
		ClassLoader cl2 = this.getClass().getClassLoader();
		Thread.currentThread().setContextClassLoader(cl2);*/
		LOG.info("Starting...");
		String args[] = { "50" };
		long noOfTemperatureEvents = 1000;
		
		if (args.length != 1) {
			LOG.debug("No override of number of events detected - defaulting to "
					+ noOfTemperatureEvents + " events.");
		} else {
			noOfTemperatureEvents = Long.valueOf(args[0]);
		}

		// Load spring config
		/*
		 * ClassPathXmlApplicationContext appContext = new
		 * ClassPathXmlApplicationContext(new String[] {
		 * "application-context.xml" }); BeanFactory factory = (BeanFactory)
		 * appContext;
		 */

		// Start Demo
		/*
		 * RandomTemperatureEventGenerator generator =
		 * (RandomTemperatureEventGenerator) factory.getBean("eventGenerator");
		 */
		generator.startSendingTemperatureReadings(noOfTemperatureEvents);

	}

}
