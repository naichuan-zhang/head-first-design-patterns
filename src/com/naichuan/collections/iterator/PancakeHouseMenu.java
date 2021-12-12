package com.naichuan.collections.iterator;

import java.util.ArrayList;

/**
 * @author Naichuan Zhang
 * @since 12/11/2021
 */
public class PancakeHouseMenu implements Menu {
    ArrayList<String> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();
        addItem("K&B's Pancake Breakfast");
        addItem("Regular Pancake Breakfast");
        addItem("Blueberry Pancakes");
        addItem("Waffles");
    }

    public void addItem(String name) {
        menuItems.add(name);
    }

    public ArrayList<String> getMenuItems() {
        return menuItems;
    }

    @Override
    public Iterator createIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }

    @Override
    public String toString() {
        return "Pancake House Menu";
    }
}
