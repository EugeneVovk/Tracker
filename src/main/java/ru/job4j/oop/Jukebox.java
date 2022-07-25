package ru.job4j.oop;

public class Jukebox {
    public static void main(String[] args) {
        Jukebox jB = new Jukebox();
        String song = "I believe, I can fly";
        jB.music(2);
        jB.song(song);
    }

    public void music(int position) {
        switch (position) {
            case 1 -> System.out.println("Пусть бегут неуклюже");
            case 2 -> System.out.println("Спокойной ночи");
            default -> System.out.println("Песня не найдена");
        }
    }

    public void song(String lyrics) {
        System.out.println("I can sign a song : " + lyrics);
    }
}
