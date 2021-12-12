package com.naichuan.strategy;

/**
 * @author Naichuan Zhang
 * @since 12/12/2021
 */
public class DecoyDuck extends Duck {
    public DecoyDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new MuteQuack());
    }

    @Override
    void display() {
        System.out.println("I'm a duck Decoy");
    }
}
