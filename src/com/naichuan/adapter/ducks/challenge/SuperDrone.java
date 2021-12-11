package com.naichuan.adapter.ducks.challenge;

/**
 * @author Naichuan Zhang
 * @since 12/11/2021
 */
public class SuperDrone implements Drone {
    @Override
    public void beep() {
        System.out.println("Beep beep beep");
    }

    @Override
    public void spin_rotors() {
        System.out.println("Rotors are spinning");
    }

    @Override
    public void take_off() {
        System.out.println("Taking off");
    }
}
