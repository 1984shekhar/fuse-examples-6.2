package com.mycompany.rmi.consumer;

/**
 * Implementation of the service which returns a message.
 *
 * @version 
 */
public class HelloServiceImpl implements HelloService {

	ClassLoader defaultClassLoader = null;
	ClassLoader presentClassLoader = null;
    public String hello(String name, String lastName) {
        return "Hello... " + name + lastName;
    }

    public void testinit(){
    	defaultClassLoader = Thread.currentThread().getContextClassLoader();
    	presentClassLoader = this.getClass().getClassLoader();
    	Thread.currentThread().setContextClassLoader(presentClassLoader);
    }
    
    public void testdestroy(){
    	Thread.currentThread().setContextClassLoader(defaultClassLoader);
    }
	
}