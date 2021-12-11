package com.naichuan.adapter.ducks;

/**
 * @author Naichuan Zhang
 * @since 12/11/2021
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
