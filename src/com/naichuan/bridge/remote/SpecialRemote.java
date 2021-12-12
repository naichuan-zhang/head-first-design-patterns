package com.naichuan.bridge.remote;

/**
 * @author Naichuan Zhang
 * @since 12/12/2021
 */
public class SpecialRemote extends RemoteControl {
    public SpecialRemote(TVFactory factory) {
        super(factory);
    }

    public void up() {
        int channel = this.getChannel();
        this.setChannel(channel + 1);
    }

    public void down() {
        int channel = this.getChannel();
        this.setChannel(channel - 1);
    }
}
