package com.naichuan.templatemethod.list;

import java.util.AbstractList;

/**
 * @author Naichuan Zhang
 * @since 12/11/2021
 */
public class MyStringList extends AbstractList<String> {
    private String[] myList;

    MyStringList(String[] strings) {
        myList = strings;
    }

    @Override
    public String get(int index) {
        return myList[index];
    }

    @Override
    public String set(int index, String element) {
        String oldString = myList[index];
        myList[index] = element;
        return oldString;
    }

    @Override
    public int size() {
        return myList.length;
    }
}
