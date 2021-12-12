package com.naichuan.prototype;

/**
 * @author Naichuan Zhang
 * @since 12/12/2021
 */
public class Drakon extends Monster {
    public Drakon(String name, int numHeads, boolean canBreatheFire) {
        super(name);
        this.numHeads = numHeads;
        this.canBreatheFire = canBreatheFire;
    }

    @Override
    public void spitPoison() {
        System.out.println(this.name + " spits poison");
    }

    @Override
    public Monster copy() throws CloneNotSupportedException {
        return (Monster) this.clone();
    }
}
