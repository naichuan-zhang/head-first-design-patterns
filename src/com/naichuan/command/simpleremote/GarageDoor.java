package com.naichuan.command.simpleremote;

/**
 * @author Naichuan Zhang
 * @since 12/11/2021
 */
public class GarageDoor {
    public GarageDoor() {
    }

    public void up() {
        System.out.println("Garage Door is open");
    }

    public void down() {
        System.out.println("Garage Door is closed");
    }

    public void stop() {
        System.out.println("Garage Door is stopped");
    }

    public void lightOn() {
        System.out.println("Garage light is on");
    }

    public void lightOff() {
        System.out.println("Garage light is off");
    }
}
