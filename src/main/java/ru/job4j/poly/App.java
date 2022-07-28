package ru.job4j.poly;

public class App {
    public static void main(String[] args) {
        Store store = new DbStore();
        Service service = new Service(store);
        service.extract();
    }
}
