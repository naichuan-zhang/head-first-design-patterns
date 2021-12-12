package com.naichuan.bridge.remote;

/**
 * @author Naichuan Zhang
 * @since 12/12/2021
 */
public abstract class TV {
    public abstract void on();
    public abstract void off();
    public abstract void tuneChannel(int channel);
    public abstract int getChannel();
}
