package Hw7;

import java.security.PublicKey;
import java.time.Year;
import java.util.Scanner;

public class Worker {
    private String bio;
    private int year;
    private String position;

    public Worker(String bio, String position, int year){
        this.bio = bio;
        this.position = position;
        this.year = year;
    }



    public String getBio() {
        return bio;

    }

    public int getYear() {
        int currentYear = Year.now().getValue();
        return currentYear - year;
    }
    @Override
    public String toString() {
        return "Worker{" +
                "bio='" + bio + '\'' +
                ", year=" + year +
                '}';
    }
}
