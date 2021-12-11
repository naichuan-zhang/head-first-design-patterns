package com.naichuan.ducks;

/**
 * @author Naichuan Zhang
 * @since 12/11/2021
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
