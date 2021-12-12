package com.naichuan.bridge.remote;

/**
 * @author Naichuan Zhang
 * @since 12/12/2021
 */
public class Client {
    public static void main(String[] args) {
        TVFactory factory = new TVFactory();
        SpecialRemote remoteSony = new SpecialRemote(factory);
        System.out.println("Connect your remote to the TV");
        remoteSony.setTv("Sony");
        remoteSony.on();
        remoteSony.up();
        remoteSony.down();
        remoteSony.off();

        GenericRemote remoteLG = new GenericRemote(factory);
        System.out.println("Connect your remote to the TV");
        remoteLG.setTv("LG");
        remoteLG.on();
        remoteLG.nextChannel();
        remoteLG.prevChannel();
        remoteLG.off();
    }
}
