package ru.job4j.oop.story2;

public class Fox implements CanEat {
    @Override
    public void tryEat(Ball ball) {
        ball.tryRun(false);
    }
}
