package Hw5_2;
import java.util.ArrayList;

public class Zoo {
//    public static ArrayList<String>animals;
//    public Zoo() {
//        animals = new ArrayList<>();
//    }
//
//    public void add(int index, String animal) {
//        animals.add(index, animal);
//    }
//
//    public static void printAnimals() {
//        System.out.println(animals);
//    }


    public static void main(String[] args) {
        ArrayList<String> zoo = new ArrayList<>();
        zoo.add(0, "Lion");
        zoo.add(1, "Tiger");
        zoo.add(2, "Elephant");
        zoo.add(3, "Giraffe");
        zoo.add(4, "Monkey");
        zoo.add(5, "Zebra");
        zoo.add(6, "Kangaroo");
        zoo.add(7, "Penguin");

        System.out.println(zoo);
        //завдання3
        zoo.remove(2);
        zoo.remove(3);
        zoo.remove(4);
        System.out.println(zoo.size());
        System.out.println(zoo);




    }
}