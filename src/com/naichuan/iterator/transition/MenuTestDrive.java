package com.naichuan.iterator.transition;

import com.naichuan.iterator.implicit.DinerMenu;
import com.naichuan.iterator.implicit.Menu;
import com.naichuan.iterator.implicit.PancakeHouseMenu;

import java.util.ArrayList;

/**
 * @author Naichuan Zhang
 * @since 12/11/2021
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        ArrayList<Menu> menus = new ArrayList<>();
        menus.add(pancakeHouseMenu);
        menus.add(dinerMenu);
        Waitress waitress = new Waitress(menus);
        waitress.printMenu();
    }
}
