package ru.job4j.patterns.factory.one;

/**
 * Класс реализации интерфейса DeveloperFactory
 */
public class JavaDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
