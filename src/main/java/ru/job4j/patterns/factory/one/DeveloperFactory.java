package ru.job4j.patterns.factory.one;

/**
 * Сущность, которая будет создавать разработчика
 */
public interface DeveloperFactory {
    Developer createDeveloper();
}
