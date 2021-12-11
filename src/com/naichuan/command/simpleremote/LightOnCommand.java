package com.naichuan.command.simpleremote;

/**
 * @author Naichuan Zhang
 * @since 12/11/2021
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
