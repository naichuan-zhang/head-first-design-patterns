package com.naichuan.proxy.gumball;

import java.io.Serializable;

/**
 * @author Naichuan Zhang
 * @since 12/12/2021
 */
public interface State extends Serializable {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();

    void refill();
}
