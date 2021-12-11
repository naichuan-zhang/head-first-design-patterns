package com.naichuan.adapter.iterenum;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

/**
 * @author Naichuan Zhang
 * @since 12/11/2021
 */
public class EnumerationIteratorTestDrive {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>(Arrays.asList(args));
        Iterator<?> iterator = new EnumerationIterator(v.elements());
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
