package ru.job4j.oop;

public class Cat {
    public static void main(String[] args) {
        Cat kitten = new Cat();
        System.out.println("Kitten says " + kitten.sound());
    }
    public String sound() {
        return "Meow";
    }
}
