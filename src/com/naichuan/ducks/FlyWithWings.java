package com.naichuan.ducks;

/**
 * @author Naichuan Zhang
 * @since 12/11/2021
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying!!");
    }
}
