package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {

    @Test
    public void when00and40and04Then8() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        double expected = 8;
        double actual = triangle.area();
        Assert.assertEquals(expected, actual, 0.01);
    }
    @Test
    public void whenTriangleNotExist() {
        Point a = new Point(0, 2);
        Point b = new Point(0, 1);
        Point c = new Point(0, 7);
        Triangle triangle = new Triangle(a, b, c);
        double expected = -1;
        double actual = triangle.area();
        Assert.assertEquals(expected, actual, 0.01);
    }
}
