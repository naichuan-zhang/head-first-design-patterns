package com.naichuan.command.diner;

/**
 * @author Naichuan Zhang
 * @since 12/11/2021
 */
public class Waitress {
    Order order;

    public Waitress() {}

    public void takeOrder(Order order) {
        this.order = order;
        order.orderUp();
    }
}
