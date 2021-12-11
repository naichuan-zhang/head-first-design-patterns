package com.naichuan.command.remote;

/**
 * @author Naichuan Zhang
 * @since 12/11/2021
 */
public class HottubOffCommand implements Command {
    Hottub hottub;

    public HottubOffCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        hottub.bubblesOff();
        hottub.cool();
        hottub.off();
    }
}
