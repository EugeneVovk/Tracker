package ru.job4j.io;

import java.util.Scanner;

/**
 * Сделать игру 11. Смысл игры в следующем.
 * На столе лежат 11 спичек.
 * Два игрока по очереди берут от 1 до 3 спичек.
 * Выигрывает тот, кто забрал последние спички.
 */
public class Matches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " введите число от 1 до 3:");
            int matches = Integer.parseInt(scanner.nextLine());
            if (matches > 0 && matches <= 3) {
                count -= matches;
                turn = !turn;
            } else {
                System.out.println("Только 1 или 2 или 3 спички");
            }
        }
        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }
}
