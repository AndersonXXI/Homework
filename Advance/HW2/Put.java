package Advance2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Put {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть рядки (введіть 'end' для завершення):");
        String input;
        while (true) {
            input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            strings.add(input);
        }

        System.out.println("Введені рядки:");
        for (String str : strings) {
            System.out.println(str);
        }
    }
}
