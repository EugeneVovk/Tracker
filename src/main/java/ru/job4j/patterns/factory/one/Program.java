package ru.job4j.patterns.factory.one;

/**
 * Программа клиент
 */
public class Program {
    /**
     * Изменяя переменную speciality, мы получаем
     * разработчика определённой специализации.
     * И вызываем метод writeCode() данного разработчика.
     */
    public static void main(String[] args) {
        String speciality = "C";

        DeveloperFactory developerFactory = createDeveloperBySpecialty(speciality);
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();
    }

    /**
     * Метод принимает строку с названием специализации разработчика,
     * возвращает определённую фабрику разработчика,
     * в зависимости от специальности, которая нам необходима
     */
    public static DeveloperFactory createDeveloperBySpecialty(String speciality) {
        if (speciality.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (speciality.equalsIgnoreCase("c++")) {
            return new CppDeveloperFactory();
        } else if (speciality.equalsIgnoreCase("php")) {
            return new PhpDeveloperFactory();
        } else {
            throw new RuntimeException(speciality + " is unknown specialty.");
        }
    }
}
