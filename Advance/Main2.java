package Advance1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        // Заповнення списку
        for (int i = 0; i < 10; i++) {
            list.add("Елемент " + (i+1));
        }

        // Виведення вмісту списку за допомогою ітератора
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }
}
