package com.naichuan.combining.ducks;

/**
 * @author Naichuan Zhang
 * @since 12/12/2021
 */
public class DuckFactory extends AbstractDuckFactory {
    @Override
    Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    Quackable createRubberDuck() {
        return new RedheadDuck();
    }
}
