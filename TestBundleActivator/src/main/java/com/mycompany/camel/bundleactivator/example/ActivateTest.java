package com.mycompany.camel.bundleactivator.example;



import org.apache.log4j.Logger;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class ActivateTest implements BundleActivator
{
	private Logger logger = Logger.getLogger(this.getClass());

@Override
public void start(BundleContext arg0) throws Exception {
	
	ClassLoader cl1 = Thread.currentThread().getContextClassLoader();
    ClassLoader cl2 = this.getClass().getClassLoader();
    logger.info("cl1: "+cl1+ " ; cl2: "+cl2);
	
}

@Override
public void stop(BundleContext arg0) throws Exception {
	// TODO Auto-generated method stub
	
}
}
