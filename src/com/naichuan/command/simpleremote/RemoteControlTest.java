package com.naichuan.command.simpleremote;

/**
 * @author Naichuan Zhang
 * @since 12/11/2021
 */
public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        GarageOpenCommand garageOpenCommand = new GarageOpenCommand(garageDoor);

        remoteControl.setCommand(lightOnCommand);
        remoteControl.buttonWasPressed();
        remoteControl.setCommand(garageOpenCommand);
        remoteControl.buttonWasPressed();
    }
}
