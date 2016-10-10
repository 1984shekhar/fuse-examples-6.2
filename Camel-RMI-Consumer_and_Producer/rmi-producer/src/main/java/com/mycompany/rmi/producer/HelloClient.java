package com.mycompany.rmi.producer;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Client to invoke the RMI service hosted on another JVM running on localhost.
 *
 * @version 
 */
public class HelloClient {
	ClassLoader defaultClassLoader = null;
	ClassLoader presentClassLoader = null;
    public void testClient() throws Exception {
        System.out.println("Getting registry");
        Registry registry = LocateRegistry.getRegistry("localhost", 8585);

        System.out.println("Lookup service");
        com.mycompany.rmi.consumer.HelloService hello = (com.mycompany.rmi.consumer.HelloService) registry.lookup("helloServiceBean");

        System.out.println("Invoking RMI ...");
        String out = hello.hello("cs","pandey");

        System.out.println(out);
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