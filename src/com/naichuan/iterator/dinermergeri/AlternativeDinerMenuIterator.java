package com.naichuan.iterator.dinermergeri;

import java.util.Calendar;
import java.util.Iterator;

/**
 * @author Naichuan Zhang
 * @since 12/12/2021
 */
public class AlternativeDinerMenuIterator implements Iterator<Object> {
    MenuItem[] items;
    int position;

    public AlternativeDinerMenuIterator(MenuItem[] items) {
        this.items = items;
        position = Calendar.DAY_OF_WEEK % 2;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = items[position];
        position = position + 2;
        return menuItem;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
