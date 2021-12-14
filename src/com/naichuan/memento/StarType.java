package com.naichuan.memento;

/**
 * @author Naichuan Zhang
 * @since 12/14/2021
 */
public enum StarType {
    SUN("sun"),
    RED_GIANT("red giant"),
    WHITE_DWARF("white dwarf"),
    SUPERNOVA("super nova"),
    DEAD("dead star");

    private final String title;

    StarType(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
