package com.naichuan.mvc;

/**
 * @author Naichuan Zhang
 * @since 12/12/2021
 */
public interface HeartModelInterface {
    int getHeartRate();
    void registerObserver(BeatObserver observer);
    void removeObserver(BeatObserver observer);
    void registerObserver(BPMObserver observer);
    void removeObserver(BPMObserver observer);
}
