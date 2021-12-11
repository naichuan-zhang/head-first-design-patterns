package com.naichuan.command.diner;

/**
 * @author Naichuan Zhang
 * @since 12/11/2021
 */
public class BurgerAndFriesOrder implements Order {
    Cook cook;

    public BurgerAndFriesOrder(Cook cook) {
        this.cook = cook;
    }

    @Override
    public void orderUp() {
        cook.makeBurger();
        cook.makeFries();
    }
}
