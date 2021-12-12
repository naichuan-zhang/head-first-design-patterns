package com.naichuan.iterator.dinermergeri;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Naichuan Zhang
 * @since 12/12/2021
 */
public class PancakeHouseMenu implements Menu {
    ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();
        addItem("K&B's Pancake Breakfast", "....", true, 2.99);
        addItem("Regular Pancake Breakfast", "....", false, 2.99);
        addItem("Blueberry Pancakes", "....", true, 3.49);
        addItem("Waffles", "....", true, 3.59);
    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return menuItems.iterator();
    }
}
