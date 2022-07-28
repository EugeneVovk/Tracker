package ru.job4j.tracker;

import java.util.Arrays;

/**
 * Копирование массива без null
 */
public class DropArray {
    public static void main(String[] args) {
        String[] names = {"Petr", null, "Ivan", "Stepan", null};
        String[] rsl = new String[names.length];
        int size = 0;
        for (String name : names) {
            if (name != null) {
                rsl[size] = name;
                size++;
            }
        }
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(rsl));
        rsl = Arrays.copyOf(rsl, size);
        System.out.println(Arrays.toString(rsl));
    }
}
