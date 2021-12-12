package com.naichuan.combining.ducks;

/**
 * @author Naichuan Zhang
 * @since 12/12/2021
 */
public abstract class AbstractDuckFactory {

    abstract Quackable createMallardDuck();
    abstract Quackable createRedheadDuck();
    abstract Quackable createDuckCall();
    abstract Quackable createRubberDuck();
}
