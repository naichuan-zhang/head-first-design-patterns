package com.naichuan.collections.iterator;

/**
 * @author Naichuan Zhang
 * @since 12/11/2021
 */
public class Cafe {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        Iterator pancakeHouseMenuIterator = pancakeHouseMenu.createIterator();
        Iterator dinerMenuIterator = dinerMenu.createIterator();

        printMenu(pancakeHouseMenuIterator);
        System.out.println("---------------------");
        printMenu(dinerMenuIterator);
    }

    private static void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            String menuItem = (String) iterator.next();
            System.out.println(menuItem);
        }
    }
}
