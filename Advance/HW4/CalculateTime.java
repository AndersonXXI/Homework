package L4.HW;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;

public class CalculateTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //ArrayList<Integer> birthday = new ArrayList<>();

        System.out.println("Введіть рік народження: ");
        int year = sc.nextInt();
        System.out.println("Введіть місяць народження: ");
        int month = sc.nextInt();
        System.out.println("Введіть день народження: ");
        int day = sc.nextInt();
        //System.out.println("Введіть година народження: ");
        //int hour = sc.nextInt();
        LocalDate birthDate = LocalDate.of(year, month, day);

        String timePassed = calculateTimePassed(birthDate);
        System.out.println("Пройшло часу з дня народження: " + timePassed);

    }
    public static String calculateTimePassed(LocalDate fromDate) {
        LocalDateTime currentDateTime = LocalDateTime.now();

        Period period = Period.between(fromDate, currentDateTime.toLocalDate());
        long hours = Duration.between(fromDate.atStartOfDay(), currentDateTime).toHours()%60;
        long minutes = Duration.between(fromDate.atStartOfDay(), currentDateTime).toMinutes()%60;
        long seconds = Duration.between(fromDate.atStartOfDay(), currentDateTime).toSeconds()%60;
        //long hours = fromDate.until(currentDateTime, ChronoUnit.HOURS)% 60;
        //long minutes = fromDate.until(currentDateTime, ChronoUnit.MINUTES) % 60;
        //long seconds = fromDate.until(currentDateTime, ChronoUnit.SECONDS) % 60;

        String formattedTimePassed = String.format("%d років, %d місяців, %d днів, %d годин, %d хвилин та %d секунд",
                period.getYears(), period.getMonths(), period.getDays(), hours, minutes, seconds);

        return formattedTimePassed;
    }
}
