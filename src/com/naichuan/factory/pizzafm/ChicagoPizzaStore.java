package com.naichuan.factory.pizzafm;

/**
 * @author Naichuan Zhang
 * @since 12/11/2021
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (item.equals("clam")) {
            return new ChicagoStyleClamPizza();
        } else {
            return null;
        }
    }
}
