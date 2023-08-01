package HW9_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(100); // Випадкове число від 0 до 99
            numbers.add(randomNumber);
        }

        System.out.println("Список чисел: " + numbers);

        numbers = numbers.stream()
                .map(num -> num * num)
                .collect(Collectors.toList());

        System.out.println("Список квадратів чисел: " + numbers);

        int sumOfSquares = numbers.stream()
                .reduce(0, Integer::sum);

        System.out.println("Сума квадратів чисел: " + sumOfSquares);
    }
}
