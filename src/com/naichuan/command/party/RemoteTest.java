package com.naichuan.command.party;

/**
 * @author Naichuan Zhang
 * @since 12/11/2021
 */
public class RemoteTest {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light("Living Room");
        Hottub hottub = new Hottub();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        HottubOnCommand hottubOnCommand = new HottubOnCommand(hottub);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        HottubOffCommand hottubOffCommand = new HottubOffCommand(hottub);
        Command[] partyOn = {lightOnCommand, hottubOnCommand};
        Command[] partyOff = {lightOffCommand, hottubOffCommand};
        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);
        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

        System.out.println(remoteControl);
        System.out.println("--- Pushing Macro On ---");
        remoteControl.onButtonWasPressed(0);
        System.out.println("--- Pushing Macro Off ---");
        remoteControl.offButtonWasPressed(0);
    }
}
