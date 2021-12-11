package com.naichuan.facade.hometheater;

/**
 * @author Naichuan Zhang
 * @since 12/11/2021
 */
public class CdPlayer {
    String description;
    int currentTrack;
    Amplifier amplifier;
    String title;

    public CdPlayer(String description, Amplifier amplifier) {
        this.description = description;
        this.amplifier = amplifier;
    }

    public void on() {
        System.out.println(description + " on");
    }

    public void off() {
        System.out.println(description + " off");
    }

    public void eject() {
        title = null;
        System.out.println(description + " eject");
    }

    public void play() {
        this.title = title;
        currentTrack = 0;
        System.out.println(description + " playing \"" + title + "\"");
    }

    public void play(int track) {
        if (this.title == null) {
            System.out.println(description + " can't play track " + currentTrack + ", no cd inserted");
        } else {
            currentTrack = track;
            System.out.println(description + " playing track " + currentTrack);
        }
    }

    public void stop() {
        currentTrack = 0;
        System.out.println(description + " stopped");
    }

    public void pause() {
        System.out.println(description + " paused \"" + title + "\"");
    }

    @Override
    public String toString() {
        return "CdPlayer{" +
                "description='" + description + '\'' +
                ", currentTrack=" + currentTrack +
                ", amplifier=" + amplifier +
                ", title='" + title + '\'' +
                '}';
    }
}
