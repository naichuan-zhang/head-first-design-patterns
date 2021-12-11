package com.naichuan.templatemethod.barista;

/**
 * @author Naichuan Zhang
 * @since 12/11/2021
 */
public class TestDrive {
    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();
        System.out.println("\nMaking tea...");
        tea.prepareRecipe();
        System.out.println("\nMaking coffee...");
        coffee.prepareRecipe();

        TeaWithHook teaWithHook = new TeaWithHook();
        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();
        System.out.println("\nMaking tea...");
        teaWithHook.prepareRecipe();
        System.out.println("\nMaking coffee...");
        coffeeWithHook.prepareRecipe();
    }
}
