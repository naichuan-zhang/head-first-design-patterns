package com.naichuan.flyweight;

import java.time.LocalDate;

/**
 * @author Naichuan Zhang
 * @since 12/12/2021
 */
public class DeciduousTree implements Tree {
    // Complex trunk, branch, leaf graphic data
    @Override
    public void display(int x, int y) {
        System.out.println("Deciduous tree is located at " + x + ", " + y);
        if (!this.isWithinRange(LocalDate.now())) {
            System.out.println("The tree currently has no leaves");
        }
    }
}
