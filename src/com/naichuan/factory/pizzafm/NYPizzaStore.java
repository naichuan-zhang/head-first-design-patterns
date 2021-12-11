package com.naichuan.factory.pizzafm;

/**
 * @author Naichuan Zhang
 * @since 12/11/2021
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (item.equals("clam")) {
            return new NYStyleClamPizza();
        } else {
            return null;
        }
    }
}
