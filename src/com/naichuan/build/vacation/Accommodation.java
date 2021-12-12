package com.naichuan.build.vacation;

/**
 * @author Naichuan Zhang
 * @since 12/12/2021
 */
public abstract class Accommodation {
    String name;
    Reservation reservation = null;

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public abstract String getLocation();

    @Override
    public String toString() {
        StringBuffer display = new StringBuffer();
        display.append("You're staying at " + name);
        if (this.reservation != null) {
            display.append("\nYou have a reservation for arrival date: " + reservation.getArrivalDate() +
                    ", staying for " + reservation.getNights() + " nights");
        }
        if (this.getLocation() != "") {
            display.append(" in " + this.getLocation());
        }
        display.append("\n");
        return display.toString();
    }
}
