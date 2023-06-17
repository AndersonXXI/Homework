package Hw7;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введіть перше число: ");
            double num1 = Double.parseDouble(scanner.nextLine());

            System.out.print("Введіть друге число: ");
            double num2 = Double.parseDouble(scanner.nextLine());

            System.out.println("Виберіть операцію:");
            System.out.println("1. Додавання (+)");
            System.out.println("2. Віднімання (-)");
            System.out.println("3. Множення (*)");
            System.out.println("4. Ділення (/)");

            System.out.print("Ваш вибір: ");
            int choice = Integer.parseInt(scanner.nextLine());

            double result = 0;

            switch (choice) {
                case 1:
                    result = add(num1, num2);
                    break;
                case 2:
                    result = sub(num1, num2);
                    break;
                case 3:
                    result = mul(num1, num2);
                    break;
                case 4:
                    result = div(num1, num2);
                    break;
                default:
                    System.out.println("Некоректний вибір операції.");
                    return;
            }

            System.out.println("Результат: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Некоректне введення чисел.");
        } catch (ArithmeticException e) {
            System.out.println("Помилка: Ділення на нуль.");
        }
    }

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double sub(double num1, double num2) {
        return num1 - num2;
    }

    public static double mul(double num1, double num2) {
        return num1 * num2;
    }

    public static double div(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException();
        }
        return num1 / num2;
    }
}
