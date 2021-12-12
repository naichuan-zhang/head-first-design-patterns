package com.naichuan.prototype;

/**
 * @author Naichuan Zhang
 * @since 12/12/2021
 */
public class Dragon extends Monster {
    public Dragon(String name, boolean hasWing) {
        super(name);
        this.hasWings = hasWing;
        this.canBreatheFire = true;
    }

    @Override
    public Monster copy() throws CloneNotSupportedException {
        return (Monster) this.clone();
    }
}
