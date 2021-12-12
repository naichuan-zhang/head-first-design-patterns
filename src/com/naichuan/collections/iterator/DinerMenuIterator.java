package com.naichuan.collections.iterator;

/**
 * @author Naichuan Zhang
 * @since 12/11/2021
 */
public class DinerMenuIterator implements Iterator {
    String[] items;
    int position = 0;

    public DinerMenuIterator(String[] items) {
        this.items = items;
    }

    @Override
    public Object next() {
        return items[position++];
    }

    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }
}
