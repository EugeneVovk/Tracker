package ru.job4j.oop;

/**
 * Каждый объект резервирует свой кусочек памяти.
 * В этот кусок памяти мы записываем данные,
 * которые принадлежат конкретному объекту.
 */
public class Cat {
    public static void main(String[] args) {
        Cat kitten = new Cat();
        Cat gav = new Cat();
        Cat black = new Cat();
        System.out.println("Kitten says " + kitten.sound());
        gav.giveName("Gav");
        gav.eat("kotleta");
        gav.show();
        black.giveName("Black");
        black.eat("fish");
        black.show();
    }

    private String name;
    private String food;

    /**
     * метод void show(), который будет выводить
     * в консоль содержимое поля food
     */
    public void show() {
        System.out.println("Kitty's name is " + this.name);
        System.out.println("His food is " + this.food);
    }

    /**
     * Метод, который записывает в поле объекта данные
     *
     * @param meat - данные, которые надо записать
     */
    public void eat(String meat) {
        this.food = meat;
    }

    public void giveName(String name) {
        this.name = name;
    }

    public String sound() {
        return "Meow";
    }
}
