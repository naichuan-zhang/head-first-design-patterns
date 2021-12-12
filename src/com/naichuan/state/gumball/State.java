package com.naichuan.state.gumball;

/**
 * @author Naichuan Zhang
 * @since 12/12/2021
 */
public interface State {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();

    void refill();
}
