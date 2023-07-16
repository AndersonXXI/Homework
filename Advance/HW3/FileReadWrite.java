package L3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReadWrite {
    public static void main(String[] args) {
        String filePath = "src\\L3\\Test.txt";


        writeToFile(filePath, "Hello, World!");


        String data = readFromFile(filePath);
        System.out.println("Прочитані дані з файлу: " + data);
    }

    public static void writeToFile(String filePath, String data) {
        try {
            FileWriter writer = new FileWriter(filePath);
            writer.write(data);
            writer.close();
            System.out.println("Дані успішно записано у файл.");
        } catch (IOException e) {
            System.out.println("Помилка при записі до файлу.");
            e.printStackTrace();
        }
    }

    public static String readFromFile(String filePath) {
        StringBuilder data = new StringBuilder();
        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                data.append(scanner.nextLine()).append("\n");
            }
            scanner.close();
        } catch (IOException e) {
            System.out.println("Помилка при читанні файлу.");
            e.printStackTrace();
        }
        return data.toString();
    }
}
