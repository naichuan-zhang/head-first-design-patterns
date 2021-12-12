package com.naichuan.composite.menu;

/**
 * @author Naichuan Zhang
 * @since 12/12/2021
 */
public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }
}
