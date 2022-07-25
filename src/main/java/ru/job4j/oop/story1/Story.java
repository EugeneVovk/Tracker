package ru.job4j.oop.story1;

public class Story {
    public static void main(String[] args) {
        Pioneer petya = new Pioneer();
        Girl girl = new Girl();
        Wolf wolf = new Wolf();
        girl.canCallForHelp(petya);
        wolf.canEat(girl);
        petya.canKillWolf(wolf);
    }
}
