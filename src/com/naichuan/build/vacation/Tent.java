package com.naichuan.build.vacation;

/**
 * @author Naichuan Zhang
 * @since 12/12/2021
 */
public class Tent extends Accommodation {
    int siteNumber;

    public Tent() {
        this.name = "Tent";
    }

    public Tent(String name) {
        this.name = name;
    }

    public void setSiteNumber(int siteNumber) {
        this.siteNumber = siteNumber;
    }

    public int getSiteNumber() {
        return siteNumber;
    }

    @Override
    public String getLocation() {
        if (siteNumber == 0) {
            return "";
        } else {
            return "Site number " + this.siteNumber;
        }
    }
}
