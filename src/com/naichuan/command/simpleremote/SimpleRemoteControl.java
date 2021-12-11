package com.naichuan.command.simpleremote;

/**
 * @author Naichuan Zhang
 * @since 12/11/2021
 */
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {}

    public void setCommand(Command command) {
        this.slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
