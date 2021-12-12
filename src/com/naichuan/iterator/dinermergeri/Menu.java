package com.naichuan.iterator.dinermergeri;

import java.util.Iterator;

/**
 * @author Naichuan Zhang
 * @since 12/12/2021
 */
public interface Menu {
    Iterator<MenuItem> createIterator();
}
