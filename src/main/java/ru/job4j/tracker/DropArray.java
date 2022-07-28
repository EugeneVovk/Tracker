package ru.job4j.tracker;

import java.util.Arrays;

/**
 * Копирование массива без null
 *
 * Вначале мы создаем два массива. Один заполнен строками и нулями.
 * Второй массив создаем пустой по размеру первого.
 * В него мы будем копировать ненулевые элементы.
 * Далее мы создаем цикл и перебираем все элементы.
 * Если элемент не равен null, то мы его записываем в пустой массив.
 * Перед циклом мы объявили счетчик size.
 * Он одновременно является текущим индексом для массива rsl,
 * также мы будем обрезать этот массив по этому размеру.
 * На последнем этапе мы обрезаем новый массив по полученному размеру.
 *
 * rsl = Arrays.copyOf(rsl, size);
 */
public class DropArray {
    public static void main(String[] args) {
        String[] names = {"Petr", null, "Ivan", "Stepan", null};
        String[] rsl = new String[names.length];
        int size = 0;
        for (String name : names) {
            if (name != null) {
                rsl[size] = name;
                size++;
            }
        }
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(rsl));
        rsl = Arrays.copyOf(rsl, size);
        System.out.println(Arrays.toString(rsl));
    }
}
