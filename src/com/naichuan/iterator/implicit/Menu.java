package com.naichuan.iterator.implicit;

import java.util.Iterator;

/**
 * @author Naichuan Zhang
 * @since 12/11/2021
 */
public interface Menu {
    Iterator<MenuItem> createIterator();
}
