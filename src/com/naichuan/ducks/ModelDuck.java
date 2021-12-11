package com.naichuan.ducks;

/**
 * @author Naichuan Zhang
 * @since 12/11/2021
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
