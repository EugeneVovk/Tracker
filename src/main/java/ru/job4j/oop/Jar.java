package ru.job4j.oop;

/**
 * С помощью одного класса мы распишем взаимодействие двух объектов.
 * Рассмотрим классическую задачу.
 * У нас есть два сосуда с водой.
 * Нужно перелить из одного сосуда в другой всю воду.
 */
public class Jar {
    public static void main(String[] args) {
        Jar first = new Jar(10);
        Jar second = new Jar(5);
        System.out.println("first : " + first.value + ". second : " + second.value);
        first.pour(second);
        System.out.println("first : " + first.value + ". second : " + second.value);
    }

    private int value;

    public Jar(int size) {
        this.value = size;
    }

    public void pour(Jar another) {
        this.value = this.value + another.value;
        another.value = 0;
    }
}
