package Hw7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Worker[] user = new Worker[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Write employee data ");

        for (int i = 0; i < user.length; i++) {
            try {
                System.out.println("Worker "+ (i+1) + ":");
                System.out.print("Full name: ");
                String bio = sc.nextLine();
                System.out.print("Position: ");
                String position = sc.nextLine();
                System.out.print("Write year of employment: ");
                int year = Integer.parseInt(sc.nextLine());// після дати програма ламається з помилкою NullPointerException


                user[i] = new Worker(bio,position,year);
            } catch (NumberFormatException e){
                System.out.println("Error, wrong type. Try again.");
                i--;
            }
            Arrays.sort(user, Comparator.comparing(Worker::getBio));

            System.out.print("Write work experience for research: ");
            int experience = Integer.parseInt(sc.nextLine());

            System.out.println("Full name workers with work experience more " + experience + ":");

            for (Worker worker : user) {
                if (worker.getYear() > experience) {
                    System.out.println(worker.getBio());
                }
            }


        }
    }
}
