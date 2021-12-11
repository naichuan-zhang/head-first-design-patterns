package com.naichuan.templatemethod.barista;

/**
 * @author Naichuan Zhang
 * @since 12/11/2021
 */
public class Tea extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding lemon");
    }
}
