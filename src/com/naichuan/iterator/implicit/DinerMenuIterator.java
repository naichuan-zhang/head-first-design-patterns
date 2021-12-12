package com.naichuan.iterator.implicit;

import java.util.Iterator;

/**
 * @author Naichuan Zhang
 * @since 12/11/2021
 */
public class DinerMenuIterator implements Iterator<MenuItem> {
    MenuItem[] list;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.list = items;
    }

    @Override
    public MenuItem next() {
        return list[position++];
    }

    @Override
    public boolean hasNext() {
        if (position >= list.length || list[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException("You can't remove an item until you've at least one next()");
        }
        if (list[position - 1] != null) {
            for (int i = position - 1; i < (list.length - 1); i++) {
                list[i] = list[i + 1];
            }
            list[list.length - 1] = null;
        }
    }
}
