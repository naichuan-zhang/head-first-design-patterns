package com.naichuan.singleton.chocolate;

/**
 * @author Naichuan Zhang
 * @since 12/11/2021
 */
public class ChocolateController {
    public static void main(String[] args) {
        ChocolateBoiler boiler = ChocolateBoiler.getInstance();
        boiler.fill();
        boiler.boil();
        boiler.drain();
        ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
        System.out.println(boiler2.isBoiled());
        System.out.println(boiler2.isEmpty());
    }
}
