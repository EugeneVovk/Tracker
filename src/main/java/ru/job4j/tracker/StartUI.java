package ru.job4j.tracker;

import java.util.Scanner;

/**
 * Консольное приложение для работы
 * с классом ru.job4j.tracker.Tracker.
 */
public class StartUI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }

    /**
     * Метод init() - инициализирует приложение
     * и запускает выполнение различных пользовательских действий;
     */
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            showMenu();
            System.out.print("Select: ");
            int select = Integer.parseInt(scanner.nextLine());
             if (select == 6) {
                run = false;
            } else if (select == 0) {
                 System.out.println("=== Create a new Item ===");
                 System.out.print("Enter name: ");
                 String name = scanner.nextLine();
                 Item item = new Item(name);
                 tracker.add(item);
                 System.out.println("Добавленная заявка: " + item);
            }
        }
    }

    /**
     * Метод showMenu() - выводит на экран меню
     * доступных пользовательских действий;
     */
    public void showMenu() {
        String[] menu = {
                "Add new Item", "Show all items", "Edit item",
                "Delete item", "Find item by id", "Find items by name",
                "Exit Program"
        };
        System.out.println("Menu:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + ". " + menu[i]);
        }
    }
}
