package Advance2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Family {
    public static void main(String[] args) {
        Map<String, String> cityFamilyMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть дані про сім'ї та міста:");
        while (true) {
            String city = scanner.nextLine();
            if (city.equals("end")) {
                break;
            }

            String family = scanner.nextLine();
            cityFamilyMap.put(city, family);
        }

        System.out.print("Введіть місто: ");
        String searchCity = scanner.nextLine();

        if (cityFamilyMap.containsKey(searchCity)) {
            String family = cityFamilyMap.get(searchCity);
            System.out.println("Сім'я, що проживає у місті " + searchCity + ": " + family);
        } else {
            System.out.println("Немає даних про сім'ю, що проживає у місті " + searchCity);
        }
    }
}


