package com.naichuan.prototype;

/**
 * @author Naichuan Zhang
 * @since 12/12/2021
 */
public abstract class Monster implements Cloneable {
    boolean eatsChildren = true;
    boolean hasWings = false;
    int numHeads = 1;
    boolean canBreatheFire = false;
    String name;

    public Monster(String name) {
        this.name = name;
    }

    public void spitPoison() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract Monster copy() throws CloneNotSupportedException;

    @Override
    public String toString() {
        StringBuffer s = new StringBuffer("I'm a monster named " + this.name);
        if (this.canBreatheFire) {
            s.append("I can breathe fire. ");
        }
        if (this.eatsChildren) {
            s.append("I eat children. ");
        }
        if (this.hasWings) {
            s.append("I have wings. ");
        }
        return s.toString();
    }
}
