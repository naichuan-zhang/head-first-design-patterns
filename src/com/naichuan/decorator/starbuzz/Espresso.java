package com.naichuan.decorator.starbuzz;

/**
 * @author Naichuan Zhang
 * @since 12/11/2021
 */
public class Espresso extends Beverage {
    public Espresso() {
        this.description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
