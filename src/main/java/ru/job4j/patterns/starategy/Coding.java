package ru.job4j.patterns.starategy;

public class Coding implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Coding...");
    }
}
