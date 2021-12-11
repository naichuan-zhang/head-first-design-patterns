package com.naichuan.adapter.ducks;

import com.naichuan.adapter.ducks.challenge.Drone;
import com.naichuan.adapter.ducks.challenge.DroneAdapter;
import com.naichuan.adapter.ducks.challenge.SuperDrone;

/**
 * @author Naichuan Zhang
 * @since 12/11/2021
 */
public class AdapterTestDrive {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        Turkey duckAdapter = new DuckAdapter(duck);

        System.out.println("The turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("The duck says...");
        testDuck(duck);

        System.out.println("The TurkeyAdapter says...");
        testDuck(turkeyAdapter);

        Drone drone = new SuperDrone();
        Duck droneAdapter = new DroneAdapter(drone);
        testDuck(droneAdapter);

        for (int i = 0; i < 10; i++) {
            System.out.println("The duckadapter says...");
            testTurkey(duckAdapter);
        }
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }

    static void testTurkey(Turkey turkey) {
        turkey.gobble();
        turkey.fly();
    }
}
