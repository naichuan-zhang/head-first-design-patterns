package com.naichuan.facade.hometheater;

/**
 * @author Naichuan Zhang
 * @since 12/11/2021
 */
public class Projector {
    String description;
    StreamingPlayer player;

    public Projector(String description, StreamingPlayer player) {
        this.description = description;
        this.player = player;
    }

    public void on() {
        System.out.println(description + " on");
    }

    public void off() {
        System.out.println(description + " off");
    }

    public void wideScreenMode() {
        System.out.println(description + " in wide screen mode");
    }

    public void tvMode() {
        System.out.println(description + " in tv mode");
    }

    @Override
    public String toString() {
        return "Projector{" +
                "description='" + description + '\'' +
                ", player=" + player +
                '}';
    }
}
