package com.naichuan.combining.ducks;

/**
 * @author Naichuan Zhang
 * @since 12/12/2021
 */
public class Quackologist implements Observer {
    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quackologist: " + duck + " just quacked.");
    }
}
