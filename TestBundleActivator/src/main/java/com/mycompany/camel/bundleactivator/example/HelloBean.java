package com.mycompany.camel.bundleactivator.example;

import org.apache.log4j.Logger;

public class HelloBean {
	
	private Logger logger = Logger.getLogger(this.getClass());
	public void init(){
		logger.info("within init");
	}

}
