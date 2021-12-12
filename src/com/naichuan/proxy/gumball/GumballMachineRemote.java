package com.naichuan.proxy.gumball;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author Naichuan Zhang
 * @since 12/12/2021
 */
public interface GumballMachineRemote extends Remote {
    int getCount() throws RemoteException;
    String getLocation() throws RemoteException;
    State getState() throws RemoteException;
}
