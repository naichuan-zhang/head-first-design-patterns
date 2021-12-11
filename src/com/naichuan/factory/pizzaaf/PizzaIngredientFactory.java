package com.naichuan.factory.pizzaaf;

/**
 * @author Naichuan Zhang
 * @since 12/11/2021
 */
public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClam();
}
