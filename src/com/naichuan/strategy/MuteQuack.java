package com.naichuan.strategy;

/**
 * @author Naichuan Zhang
 * @since 12/12/2021
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
