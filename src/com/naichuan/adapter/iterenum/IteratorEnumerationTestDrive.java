package com.naichuan.adapter.iterenum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;

/**
 * @author Naichuan Zhang
 * @since 12/11/2021
 */
public class IteratorEnumerationTestDrive {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>(Arrays.asList(args));
        Enumeration<?> enumeration = new IteratorEnumeration(l.iterator());
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}
