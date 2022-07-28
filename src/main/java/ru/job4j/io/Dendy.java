package ru.job4j.io;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Dendy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        while (run) {
            menu();
            try {
                int select = scanner.nextInt();
                switch (select) {
                    case 1 -> System.out.println("Танчики загружаются ... ");
                    case 2 -> System.out.println("Супер Марио загружается ... ");
                    case 3 -> {
                        System.out.println("Игра завершена.");
                        run = false;
                    }
                    default -> System.out.println("Такой игры нет.");
                }
                System.out.println();
            } catch (InputMismatchException ime) {
                System.err.println("Надо было ввести только цифру из меню. Пока! :)");
                break;
            }
        }
    }

    private static void menu() {
        System.out.println("Игры.");
        System.out.println("1. Танчики");
        System.out.println("2. Супер Марио");
        System.out.println("3. Выйти");
        System.out.print("Введите пункт меню, чтобы начать игру: ");
    }
}
