package com.naichuan.iterator.dinermergeri;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Naichuan Zhang
 * @since 12/12/2021
 */
public class Waitress {
    Menu pancakeHouseMenu;
    Menu dinerMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu(int withNewConstructs) {
        ArrayList<MenuItem> breakfastItems = ((PancakeHouseMenu) pancakeHouseMenu).getMenuItems();
        for (MenuItem m : breakfastItems) {
            printMenuItem(m);
        }
        MenuItem[] lunchItems = ((DinerMenu) dinerMenu).getMenuItems();
        for (MenuItem m : lunchItems) {
            printMenuItem(m);
        }
    }

    private void printMenuItem(MenuItem menuItem) {
        System.out.print(menuItem.getName() + ", ");
        System.out.print(menuItem.getPrice() + ", ");
        System.out.println(menuItem.getDescription());
    }

    public void printMenu() {
        Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();
        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(pancakeIterator);
        System.out.println("\nLUNCH");
        printMenu(dinerIterator);
    }

    private void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            printMenuItem(menuItem);
        }
    }

    public void printVegetarianMenu() {
        System.out.println("\nVEGETARIAN MENU\n----\nBREAKFAST");
        printVegetarianMenu(pancakeHouseMenu.createIterator());
        System.out.println("\nLUNCH");
        printVegetarianMenu(dinerMenu.createIterator());
    }

    private void printVegetarianMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            if (menuItem.isVegetarian()) {
                printMenuItem(menuItem);
            }
        }
    }

    public boolean isItemVegetarian(String name) {
        Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
        if (isVegetarian(name, pancakeIterator)) {
            return true;
        }
        Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();
        if (isVegetarian(name, dinerIterator)) {
            return true;
        }
        return false;
    }

    private boolean isVegetarian(String name, Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            if (menuItem.getName().equals(name)) {
                if (menuItem.isVegetarian()) {
                    return true;
                }
            }
        }
        return false;
    }
}
