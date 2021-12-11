package com.naichuan.command.diner;

/**
 * @author Naichuan Zhang
 * @since 12/11/2021
 */
public class Diner {
    public static void main(String[] args) {
        Cook cook = new Cook();
        Waitress waitress = new Waitress();
        Customer customer = new Customer(waitress);
        customer.createOrder(new BurgerAndFriesOrder(cook));
        customer.hungry();
    }
}
