package com.mycompany.rmi.consumer;

/**
 * Implementation of the service which returns a message.
 *
 * @version 
 */
public class HelloServiceImpl implements HelloService {

    public String hello(String name) {
        return "Hello " + name;
    }

}