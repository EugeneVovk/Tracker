package ru.job4j.oop;

/**
 * Когда же стоит использовать статические методы?
 * 1. Для доступа или управления статическими переменными
 * и другими статическими методами, которые не зависят от объектов;
 * 2. Для служебных, вспомогательных классов и интерфейсов,
 * поскольку не требуют создания объекта и соответственно,
 * обеспечивают большую производительность;
 * 3. Когда методу требуется доступ лишь к статическим полям класса.
 * <p>
 * В завершении стоит подытожить и подчеркнуть особенности статических методов:
 * 1. Статические методы нельзя переопределять.
 * Статические методы не имеют возможности быть переопределенными;
 * 2. Статические методы не могут использовать ключевые слова this
 * (ссылка на текущий объект) или super (ссылка на объект суперкласса);
 * 3. Нестатические методы могут обращаться непосредственно
 * как к методам класса, так и к переменным класса;
 * 4. Нестатические методы могут обращаться
 * к статическим переменным и статическим методам;
 * 5. Статические методы могут обращаться ко всем статическим переменным
 * и другим статическим методам.
 * Однако они не могут обращаться к переменным класса и нестатическим методам.
 * Для этого им нужны ссылки на объект.
 */
public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int y) {
        return x - y;
    }

    public int divide(int a) {
        return a / x;
    }

    public int sumAllOperation(int a) {
        return sum(a) + multiply(a) + minus(a) + divide(a);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 5;
        int result = Calculator.sum(a);
        int rsl2 = calculator.multiply(b);
        int rsl3 = Calculator.minus(a);
        int rsl4 = calculator.divide(b);
        int rsl5 = calculator.sumAllOperation(b);
        System.out.println(result);
        System.out.println(rsl2);
        System.out.println(rsl3);
        System.out.println(rsl4);
        System.out.println(rsl5);
    }
}
