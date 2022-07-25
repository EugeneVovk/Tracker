package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public int getLoad() {
        return load;
    }

    /**
     * метод должен списывать заряд из батареи,
     * у кого вызывали метод exchange и добавить к объекту another.
     */
    public void exchange(Battery another) {
        another.load += this.load;
        this.load = 0;
    }
}
