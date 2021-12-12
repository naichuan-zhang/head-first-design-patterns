package com.naichuan.flyweight;

import java.time.LocalDate;
import java.time.Month;

/**
 * @author Naichuan Zhang
 * @since 12/12/2021
 */
public interface Tree {
    void display(int x, int y);
    default boolean isWithinRange(LocalDate date) {
        Month month = date.getMonth();
        return (month.getValue() > 2) && (month.getValue() < 11);
    }
}
