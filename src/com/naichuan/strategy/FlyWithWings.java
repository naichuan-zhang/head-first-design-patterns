package com.naichuan.strategy;

/**
 * @author Naichuan Zhang
 * @since 12/12/2021
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying!!");
    }
}
