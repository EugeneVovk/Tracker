package ru.job4j.oop.story2;

public class Ball implements CanEscape {
    @Override
    public void tryRun(boolean condition) {
        if (!condition) {
            System.out.println("Ball is eaten");
        } else {
            System.out.println("Ball is escaped");
        }
    }
}
