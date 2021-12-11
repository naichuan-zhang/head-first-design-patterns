package com.naichuan.facade.hometheater;

/**
 * @author Naichuan Zhang
 * @since 12/11/2021
 */
public class Amplifier {
    String description;
    Tuner tuner;
    StreamingPlayer player;

    public Amplifier(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + " on");
    }

    public void off() {
        System.out.println(description + " off");
    }

    public void setStereoSound() {
        System.out.println(description + " stereo mode on");
    }

    public void setSurroundSound() {
        System.out.println(description + "surround sound on");
    }

    public void setVolume(int level) {
        System.out.println(description + " setting volume to " + level);
    }

    public void setTuner(Tuner tuner) {
        System.out.println(description + " setting tuner to " + tuner);
        this.tuner = tuner;
    }

    public void setStreamingPlayer(StreamingPlayer player) {
        System.out.println(description + " setting streaming player to " + player);
        this.player = player;
    }

    @Override
    public String toString() {
        return "Amplifier{" +
                "description='" + description + '\'' +
                ", tuner=" + tuner +
                ", player=" + player +
                '}';
    }
}
