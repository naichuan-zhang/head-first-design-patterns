package com.naichuan.ducks;

/**
 * @author Naichuan Zhang
 * @since 12/11/2021
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        this.quackBehavior = new Quack();
        this.flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
