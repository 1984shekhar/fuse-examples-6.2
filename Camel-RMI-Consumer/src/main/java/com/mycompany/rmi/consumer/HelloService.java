package com.mycompany.rmi.consumer;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Interface for the service to expose. Notice we must extend {@link Remote} which
 * is required when using RMI.
 *
 * @version 
 */
public interface HelloService extends Remote {

    String hello(String name) throws RemoteException;

}