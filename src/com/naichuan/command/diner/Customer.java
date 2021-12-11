package com.naichuan.command.diner;

/**
 * @author Naichuan Zhang
 * @since 12/11/2021
 */
public class Customer {
    Waitress waitress;
    Order order;

    public Customer(Waitress waitress) {
        this.waitress = waitress;
    }

    public void createOrder(Order order) {
        this.order = order;
    }

    public void hungry() {
        waitress.takeOrder(order);
    }
}
