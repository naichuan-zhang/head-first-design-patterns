package com.naichuan.builder.vacation;

/**
 * @author Naichuan Zhang
 * @since 12/12/2021
 */
public class Hotel extends Accommodation {
    int roomNumber;

    public Hotel() {
        this.name = "Hotel";
    }

    public Hotel(String name) {
        this.name = name;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    @Override
    public String getLocation() {
        if (roomNumber == 0) {
            return "";
        } else {
            return "Room number " + this.roomNumber;
        }
    }
}
