package com.naichuan.decorator.starbuzz;

/**
 * @author Naichuan Zhang
 * @since 12/11/2021
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        this.description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
