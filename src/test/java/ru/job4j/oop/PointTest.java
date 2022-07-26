package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double expected = 2;
        double actual = a.distance(b);
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void when20to20then0() {
        Point a = new Point(2, 0);
        Point b = new Point(2, 0);
        double expected = 0;
        double actual = a.distance(b);
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void when22to20then2() {
        Point a = new Point(2, 2);
        Point b = new Point(2, 0);
        double expected = 2;
        double actual = a.distance(b);
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void when22to22then0() {
        Point a = new Point(2, 2);
        Point b = new Point(2, 2);
        double expected = 0;
        double actual = a.distance(b);
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void when00to00then0() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 0);
        double expected = 0;
        double actual = a.distance(b);
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void when05toMinus10then0() {
        Point a = new Point(0, 5);
        Point b = new Point(-1, 0);
        double expected = 5.09;
        double actual = a.distance(b);
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void when125And342Then5dot74() {
        Point a = new Point(1, 2, 5);
        Point b = new Point(3, 4, 0);
        double rsl = a.distance3d(b);
        double expected = 5.74;
        Assert.assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void when123AndMinus3Minus40Then7dot81() {
        Point a = new Point(1, 2, 3);
        Point b = new Point(-3, -4, 0);
        double rsl = a.distance3d(b);
        double expected = 7.81;
        Assert.assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void whenAllValuesAreTheSameThen0() {
        Point a = new Point(-1, -1, -1);
        Point b = new Point(-1, -1, -1);
        double rsl = a.distance3d(b);
        double expected = 0;
        Assert.assertEquals(expected, rsl, 0.01);
    }
}
