package ru.job4j.patterns.factory.one;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("php developer writes php code...");
    }
}
