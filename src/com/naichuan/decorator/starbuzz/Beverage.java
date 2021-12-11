package com.naichuan.decorator.starbuzz;

/**
 * @author Naichuan Zhang
 * @since 12/11/2021
 */
public abstract class Beverage {
    String description = "Unknown Beverage";
    Size size = Size.TALL;

    public String getDescription() {
        return description;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return size;
    }

    public abstract double cost();

    public enum Size {
        TALL, GRANDE, VENTI
    }
}
