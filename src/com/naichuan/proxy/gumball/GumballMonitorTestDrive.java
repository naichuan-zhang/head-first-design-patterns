package com.naichuan.proxy.gumball;

import java.rmi.Naming;

/**
 * @author Naichuan Zhang
 * @since 12/12/2021
 */
public class GumballMonitorTestDrive {
    public static void main(String[] args) {
        String[] location = new String[]{
                "rmi://santafe.mightygumball.com/gumballmachine",
                "rmi://boulder.mightygumball.com/gumballmachine",
                "rmi://austin.mightygumball.com/gumballmachine"
        };
        if (args.length >= 0) {
            location = new String[1];
            location[0] = "rmi://" + args[0] + "/gumballmachine";
            GumballMonitor[] monitors = new GumballMonitor[location.length];
            for (int i = 0; i < location.length; i++) {
                try {
                    GumballMachineRemote remote = (GumballMachineRemote) Naming.lookup(location[i]);
                    monitors[i] = new GumballMonitor(remote);
                    System.out.println(monitors[i]);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            for (int i = 0; i < monitors.length; i++) {
                monitors[i].report();
            }
        }
    }
}
