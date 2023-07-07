package Advance2;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        int N = getNumberOfElements();
        List<Integer> integerList = getIntegerList(N);
        int minimum = getMinimum(integerList);
        System.out.println("Мінімальне число: " + minimum);
    }

    public static int getNumberOfElements() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть кількість чисел: ");
        return scanner.nextInt();
    }

    public static List<Integer> getIntegerList(int N) {
        List<Integer> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть " + N + " цілих чисел:");
        for (int i = 0; i < N; i++) {
            int number = scanner.nextInt();
            list.add(number);
        }
        return list;
    }

    public static int getMinimum(List<Integer> list) {
        int minimum = Integer.MAX_VALUE;
        for (int number : list) {
            if (number < minimum) {
                minimum = number;
            }
        }
        return minimum;
    }
    }

