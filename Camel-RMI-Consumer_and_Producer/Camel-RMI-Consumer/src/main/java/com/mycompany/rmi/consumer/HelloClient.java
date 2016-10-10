package com.mycompany.rmi.consumer;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Client to invoke the RMI service hosted on another JVM running on localhost.
 *
 * @version 
 */
public final class HelloClient {

    private HelloClient() {
        // use Main
    }

    public void testClient() throws Exception {
        System.out.println("Getting registry");
        Registry registry = LocateRegistry.getRegistry("localhost", 8585);

        System.out.println("Lookup service");
        HelloService hello = (HelloService) registry.lookup("helloServiceBean");

        System.out.println("Invoking RMI ...");
        String out = hello.hello("cs","pandey");

        System.out.println(out);
    }

}