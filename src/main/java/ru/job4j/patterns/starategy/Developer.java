package ru.job4j.patterns.starategy;

/**
 * Модель разработчика
 */
public class Developer {
    private Activity activity;

    /**
     * Метод изменения активности
     */
    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    /**
     * Метод выполнения активности
     */
    public void executeActivity() {
        activity.justDoIt();
    }
}
