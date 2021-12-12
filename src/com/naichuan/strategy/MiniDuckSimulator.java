package com.naichuan.strategy;

/**
 * @author Naichuan Zhang
 * @since 12/12/2021
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        MallardDuck mallard = new MallardDuck();
        FlyBehavior cantFly = () -> System.out.println("I can't fly");
        QuackBehavior squeak = () -> System.out.println("Squeak");
        RubberDuck rubberDuck = new RubberDuck(cantFly, squeak);
        DecoyDuck decoyDuck = new DecoyDuck();
        Duck model = new ModelDuck();
        mallard.performQuack();
        rubberDuck.performQuack();
        decoyDuck.performQuack();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
