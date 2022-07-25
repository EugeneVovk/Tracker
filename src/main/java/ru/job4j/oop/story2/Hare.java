package ru.job4j.oop.story2;

public class Hare implements CanEat {
    @Override
    public void tryEat(Ball ball) {
        ball.tryRun(true);
    }
}
