package com.naichuan.templatemethod.list;

import java.util.List;

/**
 * @author Naichuan Zhang
 * @since 12/11/2021
 */
public class MyListTestDrive {
    public static void main(String[] args) {
        String[] ducks = new String[]{"Mallard Duck", "Redhead Duck", "Rubber Duck", "Decoy Duck"};
        MyStringList ducksList = new MyStringList(ducks);
        for (int i = 0; i < ducksList.size(); i++) {
            System.out.println(ducksList.get(i));
        }

        String oldDuck = ducksList.set(3, "Donald Duck");
        System.out.println("New list: ");
        for (int i = 0; i < ducksList.size(); i++) {
            System.out.println(ducksList.get(i));
        }

        List<String> ducksSubList = ducksList.subList(2, 3);
        System.out.println("Sub list: ");
        for (int i = 0; i < ducksSubList.size(); i++) {
            System.out.println(ducksSubList.get(i));
        }
    }
}
