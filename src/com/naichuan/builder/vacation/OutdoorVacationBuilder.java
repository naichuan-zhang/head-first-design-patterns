package com.naichuan.builder.vacation;

/**
 * @author Naichuan Zhang
 * @since 12/12/2021
 */
public class OutdoorVacationBuilder extends VacationBuilder {
    public OutdoorVacationBuilder() {
        this.name = "Outdoorsy Vacation Builder";
    }

    @Override
    public VacationBuilder addAccommodation() {
        this.accommodations.add(new Tent());
        return this;
    }

    @Override
    public VacationBuilder addAccommodation(String name) {
        this.accommodations.add(new Tent(name));
        return this;
    }

    @Override
    public VacationBuilder addAccommodation(String name, int year, int month, int day, int nights, int location) {
        Reservation reservation = new Reservation();
        reservation.setArrivalDate(year, month, day);
        reservation.setNights(nights);
        Tent tent = new Tent(name);
        tent.setReservation(reservation);
        tent.setSiteNumber(location);
        this.accommodations.add(tent);
        return this;
    }

    @Override
    public VacationBuilder addEvent(String event) {
        this.events.add("Hike: " + event);
        return this;
    }
}
