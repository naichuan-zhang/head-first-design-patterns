package com.naichuan.build.vacation;

/**
 * @author Naichuan Zhang
 * @since 12/12/2021
 */
public class VacationDirector {
    public static void main(String[] args) {
        VacationBuilder outdoorBuilder = new OutdoorVacationBuilder();
        Vacation outdoorVacation = outdoorBuilder
                .addAccommodation("Two person tent", 2020, 7, 1, 5, 34)
                .addEvent("Beach")
                .addAccommodation("Two person tent")
                .addEvent("Mountains")
                .getVacation();
        System.out.println(outdoorVacation);

        VacationBuilder cityBuilder = new CityVacationBuilder();
        Vacation cityVacation = cityBuilder
                .addAccommodation("Grand Facadian", 2020, 8, 1, 5, 0)
                .addAccommodation("Hotel Command", 2020, 8, 6, 2, 0)
                .addEvent("Cirque du Soleil")
                .getVacation();
        System.out.println(cityVacation);
    }
}
