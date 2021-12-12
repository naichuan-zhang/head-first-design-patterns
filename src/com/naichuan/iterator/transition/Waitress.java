package com.naichuan.iterator.transition;

import com.naichuan.iterator.implicit.Menu;
import com.naichuan.iterator.implicit.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Naichuan Zhang
 * @since 12/11/2021
 */
public class Waitress {
    ArrayList<Menu> menus;

    public Waitress(ArrayList<Menu> menus) {
        this.menus = menus;
    }

    public void printMenu() {
        Iterator<?> menuIterator = menus.iterator();
        while (menuIterator.hasNext()) {
            Menu menu = (Menu) menuIterator.next();
            printMenu(menu.createIterator());
        }
    }

    private void printMenu(Iterator<?> iterator) {
        while (iterator.hasNext()) {
            MenuItem item = (MenuItem) iterator.next();
            System.out.print(item.getName() + ", ");
            System.out.print(item.getPrice() + ", ");
            System.out.println(item.getDescription());
        }
    }
}
