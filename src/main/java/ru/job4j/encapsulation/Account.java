package ru.job4j.encapsulation;

/**
 * Класс для хранения информации о счете клиента
 */
public class Account {
    private int balance;

    public void addMoney(int money) {
        if (money > 0) {
            balance += money;
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                '}';
    }
}
