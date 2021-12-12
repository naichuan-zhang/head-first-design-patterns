package com.naichuan.bridge.remote;

/**
 * @author Naichuan Zhang
 * @since 12/12/2021
 */
public abstract class RemoteControl {
    TV tv;
    TVFactory factory;

    public RemoteControl(TVFactory factory) {
        this.factory = factory;
    }

    public void on() {
        this.tv.on();
    }

    public void off() {
        this.tv.off();
    }

    public void setChannel(int channel) {
        this.tv.tuneChannel(channel);
    }

    public int getChannel() {
        return this.tv.getChannel();
    }

    public void setTv(String type) {
        try {
            this.tv = factory.getTV(type);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
