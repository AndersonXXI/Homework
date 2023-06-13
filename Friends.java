package Hw5_2;

import java.util.ArrayList;
import java.util.Arrays;

public class Friends {
    public static void main(String[] args) {
        ArrayList<String> friends = new ArrayList<>();
        friends.add("Василь");
        friends.add("Петро");
        friends.add("Анна");
        friends.add("Василіса");
        friends.add("Іванка");
        System.out.println(friends);
        String[] friend = {"Василь", "Петро", "Анна", "Василіса", "Іванка"};
        Arrays.sort(friend);
        System.out.println(Arrays.toString(friend));
    }
}
