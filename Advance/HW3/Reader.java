package L3;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Reader {
    public static void main(String[] args) {
        String filePath = "src\\L3\\Test.txt";


        writeToFile(filePath, "Це приклад тексту, який буде записаний у файл.");

        
        String fileContent = readFileContent(filePath);
        System.out.println("Вміст файлу:");
        System.out.println(fileContent);
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

    public static String readFileContent(String filePath) {
        try {
            Path path = Paths.get(filePath);
            byte[] fileBytes = Files.readAllBytes(path);
            return new String(fileBytes);
        } catch (IOException e) {
            System.out.println("Помилка при читанні файлу.");
            e.printStackTrace();
        }
        return "";
    }
}
