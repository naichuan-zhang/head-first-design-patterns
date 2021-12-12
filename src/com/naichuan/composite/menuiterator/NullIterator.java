package com.naichuan.composite.menuiterator;

import java.util.Iterator;

/**
 * @author Naichuan Zhang
 * @since 12/12/2021
 */
public class NullIterator implements Iterator<MenuComponent> {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public MenuComponent next() {
        return null;
    }
}
