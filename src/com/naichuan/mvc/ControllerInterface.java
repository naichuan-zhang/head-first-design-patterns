package com.naichuan.mvc;

/**
 * @author Naichuan Zhang
 * @since 12/12/2021
 */
public interface ControllerInterface {
    void start();
    void stop();
    void increaseBPM();
    void decreaseBPM();
    void setBPM(int bpm);
}
