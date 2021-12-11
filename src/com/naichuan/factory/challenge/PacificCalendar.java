package com.naichuan.factory.challenge;

import java.util.List;

/**
 * @author Naichuan Zhang
 * @since 12/11/2021
 */
public class PacificCalendar extends Calendar {
    public PacificCalendar(ZoneFactory factory) {
        zone = factory.createZone("US/Pacific");
    }

    @Override
    public void createCalendar(List<String> appointments) {
        System.out.println("Making the calendar");
    }
}
