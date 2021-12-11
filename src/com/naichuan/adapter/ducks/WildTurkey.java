package com.naichuan.adapter.ducks;

/**
 * @author Naichuan Zhang
 * @since 12/11/2021
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
