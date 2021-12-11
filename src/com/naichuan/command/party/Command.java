package com.naichuan.command.party;

/**
 * @author Naichuan Zhang
 * @since 12/11/2021
 */
public interface Command {
    void execute();
    void undo();
}
