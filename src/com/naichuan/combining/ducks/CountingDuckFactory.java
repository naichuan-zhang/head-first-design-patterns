package com.naichuan.combining.ducks;

/**
 * @author Naichuan Zhang
 * @since 12/12/2021
 */
public class CountingDuckFactory extends AbstractDuckFactory {
    @Override
    Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}
