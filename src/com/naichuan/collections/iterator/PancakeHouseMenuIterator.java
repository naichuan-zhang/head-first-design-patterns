package com.naichuan.collections.iterator;

import java.util.ArrayList;

/**
 * @author Naichuan Zhang
 * @since 12/11/2021
 */
public class PancakeHouseMenuIterator implements Iterator {
    ArrayList<String> items;
    int position = 0;

    public PancakeHouseMenuIterator(ArrayList<String> items) {
        this.items = items;
    }

    @Override
    public Object next() {
        return items.get(position++);
    }

    @Override
    public boolean hasNext() {
        if (position >= items.size()) {
            return false;
        } else {
            return true;
        }
    }
}
