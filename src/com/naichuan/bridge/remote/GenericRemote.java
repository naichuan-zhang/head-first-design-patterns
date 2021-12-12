package com.naichuan.bridge.remote;

/**
 * @author Naichuan Zhang
 * @since 12/12/2021
 */
public class GenericRemote extends RemoteControl {
    public GenericRemote(TVFactory factory) {
        super(factory);
    }

    public void nextChannel() {
        int channel = this.getChannel();
        this.setChannel(channel + 1);
    }

    public void prevChannel() {
        int channel = this.getChannel();
        this.setChannel(channel - 1);
    }
}
