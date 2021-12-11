package com.naichuan.command.simpleremote;

/**
 * @author Naichuan Zhang
 * @since 12/11/2021
 */
public class GarageOpenCommand implements Command {
    GarageDoor garageDoor;

    public GarageOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }
}
