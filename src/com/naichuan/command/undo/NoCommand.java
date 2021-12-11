package com.naichuan.command.undo;

/**
 * @author Naichuan Zhang
 * @since 12/11/2021
 */
public class NoCommand implements Command {
    @Override
    public void execute() {
        // Do nothing.
    }

    @Override
    public void undo() {
        // Do nothing.
    }
}
