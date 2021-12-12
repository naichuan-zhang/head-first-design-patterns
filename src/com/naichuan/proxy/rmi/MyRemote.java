package com.naichuan.proxy.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author Naichuan Zhang
 * @since 12/12/2021
 */
public interface MyRemote extends Remote {
    String sayHello() throws RemoteException;
}
