package ru.job4j.poly;

public class Service {

    private Store store;

    public Service(Store store) {
        this.store = store;
    }

    public void extract() {
        store.save("Tom Anderson");
    }
}
