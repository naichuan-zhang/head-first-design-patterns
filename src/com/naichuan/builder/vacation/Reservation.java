package com.naichuan.builder.vacation;

import java.time.LocalDate;

/**
 * @author Naichuan Zhang
 * @since 12/12/2021
 */
public class Reservation {
    LocalDate arrivalDate;
    int nights;

    public void setArrivalDate(int year, int month, int day) {
        this.arrivalDate = LocalDate.of(year, month, day);
    }

    public LocalDate getArrivalDate() {
        return arrivalDate;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }

    public int getNights() {
        return nights;
    }
}
