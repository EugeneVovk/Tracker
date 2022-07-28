package ru.job4j.tracker;

import java.util.Arrays;

/**
 * В классе Tracker должны есть методы:
 * добавление заявок - public Item add(Item item);
 * получение списка всех заявок - public Item[] findAll();
 * получение списка по имени - public Item[] findByName(String key);
 * получение заявки по id - public Item findById(int id);
 */
public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    /**
     * Метод public Item add(Item item) добавляет заявку,
     * переданную в аргументах в массив заявок items.
     * В методе add нужно проставить уникальный ключ в объект Item item.
     * Это нужно сделать через метод setId.
     * Поле ids используется для генерации нового ключа.
     * В нашем примере мы используем последовательность.
     * То есть каждый вызов метод add будет добавлять в поле ids единицу.
     * Так мы сможем обеспечить уникальность поле id в Item.
     * Аналогичный подход используется в базах данных.
     */
    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    /**
     * Метод public Item[] findAll()
     * возвращает копию массива items
     * без null элементов (без пустых ячеек).
     */
    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    /**
     * Метод public Item[] findByName(String key)
     * проверяет в цикле все элементы массива items,
     * сравнивая name (используя метод getName класса Item)
     * с аргументом метода String key.
     * Элементы, у которых совпадает name,
     * копирует в результирующий массив и возвращает его.
     * Алгоритм этого метода аналогичен методу findAll.
     */
    public Item[] findByName(String key) {
        Item[] rsl = new Item[size];
        int len = 0;
        for (int i = 0; i < size; i++) {
            if (key.equals(items[i].getName())) {
                rsl[len++] = items[i];
            }
        }
        return Arrays.copyOf(rsl, len);
    }

    /**
     * Метод public Item findById(int id)
     * проверяет в цикле все элементы массива items,
     * сравнивая id с аргументом int id
     * и возвращает найденный Item.
     * Если Item не найден - возвращает null.
     */
    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
}