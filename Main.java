package Hw5_2;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        ListIterator<Integer> iterator = numbers.listIterator();
        while (iterator.hasNext()) {
            int number = iterator.next();
            iterator.set(number + 1);
        }

        System.out.println(numbers);
    }
}