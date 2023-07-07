package Advance2;

import java.util.ArrayList;
import java.util.Scanner;

public class Double {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> s = new ArrayList<>();
        s.add(sc.nextLine());
        s.add(sc.nextLine());
        s.add(sc.nextLine());
        s.add(sc.nextLine());
        s.add(sc.nextLine());
        doubleValues(s);
        for(String word : s){
            System.out.println(word);
        }



    }
    public static void doubleValues(ArrayList<String>s){
        ArrayList<String>doubledWords = new ArrayList<>();
        for(String word : s){
            doubledWords.add(word);
            doubledWords.add(word);
        }
        s.clear();
        s.addAll(doubledWords);
    }
}
