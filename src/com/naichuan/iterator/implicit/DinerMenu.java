package com.naichuan.iterator.implicit;

import java.util.Iterator;

/**
 * @author Naichuan Zhang
 * @since 12/11/2021
 */
public class DinerMenu implements Menu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("Vegetarian BLT", "....", true, 2.99);
        addItem("BLT", "...", false, 2.99);
        addItem("Soup of the day", "....", false, 3.29);
        addItem("Hotdog", "....", false, 3.05);
        addItem("Steamed Veggies and Brown Rice", "....", true, 3.99);
        addItem("Pasta", "....", true, 3.89);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full! Can't add item to menu");
        } else {
            menuItems[numberOfItems++] = menuItem;
        }
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
