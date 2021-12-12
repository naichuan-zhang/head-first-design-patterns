package com.naichuan.build.vacation;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Naichuan Zhang
 * @since 12/12/2021
 */
public class Vacation {
    String name;
    List<Accommodation> accommodations = new ArrayList<>();
    List<String> events = new ArrayList<>();

    public void setName(String name) {
        this.name = name;
    }

    public void setAccommodations(List<Accommodation> accommodations) {
        this.accommodations = accommodations;
    }

    public void setEvents(List<String> events) {
        this.events = events;
    }

    @Override
    public String toString() {
        StringBuffer display = new StringBuffer();
        display.append("---- " + this.name + " ----\n");
        for (Accommodation a : accommodations) {
            display.append(a);
        }
        for (String e : events) {
            display.append(e + "\n");
        }
        return display.toString();
    }
}
