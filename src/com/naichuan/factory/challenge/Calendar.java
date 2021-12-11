package com.naichuan.factory.challenge;

import java.util.List;

/**
 * @author Naichuan Zhang
 * @since 12/11/2021
 */
public abstract class Calendar {
    Zone zone;

    public void print() {
        System.out.println("--- " + zone.getDisplayName() + " Calendar ---");
        System.out.println("Offset from GMT: " + zone.getOffset());
    }

    public abstract void createCalendar(List<String> appointments);
}
