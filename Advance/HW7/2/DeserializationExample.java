package HW7_2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationExample {
    public static void main(String[] args) {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("animal.ser"))) {
            Animal animal = (Animal) inputStream.readObject();
            System.out.println("Об'єкт Animal успішно десеріалізовано:");
            animal.printInfo();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
