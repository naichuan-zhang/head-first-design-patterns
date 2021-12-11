package com.naichuan.templatemethod.barista;

/**
 * @author Naichuan Zhang
 * @since 12/11/2021
 */
public class Coffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}
