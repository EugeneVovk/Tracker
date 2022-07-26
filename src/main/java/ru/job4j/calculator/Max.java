package ru.job4j.calculator;

public class Max {
    public static int max(int first, int second) {
        return first > second ? first : second;
    }

    public static int max(int first, int second, int third) {
        return Max.max(first, Max.max(second, third));
    }
}
