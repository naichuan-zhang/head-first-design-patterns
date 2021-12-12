package com.naichuan.iterator.dinermergeri;

/**
 * @author Naichuan Zhang
 * @since 12/12/2021
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
        waitress.printMenu(1);
        waitress.printVegetarianMenu();
        System.out.println("\nCustomer asks, is the Hotdog vegetarian?");
        System.out.println("Waitress says: ");
        if (waitress.isItemVegetarian("Hotdog")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
