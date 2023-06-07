package Homework4Abstract;

public class Player implements Playable, Recodable {
    @Override
    public void play() {
        System.out.println("Почати програвання");
    }

    @Override
    public void record() {
        System.out.println("Почати запис");

    }

    @Override
    public void pause() {
        System.out.println("Зупинити");

    }

    @Override
    public void stop() {
        System.out.println("Завершити");

    }
}
