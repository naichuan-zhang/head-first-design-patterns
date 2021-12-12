package com.naichuan.iterator.implicit;

import java.util.List;

/**
 * @author Naichuan Zhang
 * @since 12/11/2021
 */
public class Waitress {
    Menu pancakeHouseMenu;
    Menu dinerMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
        this.dinerMenu = dinerMenu;
        this.pancakeHouseMenu = pancakeHouseMenu;
    }

    public void printMenu() {
        List<MenuItem> breakfastItems = ((PancakeHouseMenu) pancakeHouseMenu).getMenuItems();
        for (MenuItem m : breakfastItems) {
            printMenuItem(m);
        }

        MenuItem[] lunchItems = ((DinerMenu) dinerMenu).getMenuItems();
        for (MenuItem m : lunchItems) {
            printMenuItem(m);
        }
    }

    public void printMenuItem(MenuItem menuItem) {
        System.out.print(menuItem.getName() + ", ");
        System.out.print(menuItem.getPrice() + ", ");
        System.out.println(menuItem.getDescription());
    }
}
