package academy.devdojo.javaoneforall.exercises;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        String dateToday = "27/06/2025";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your date birthday: ");
        String date = scanner.nextLine();
        LocalDateTime date1 = LocalDateTime.parse(date, dtf);
        LocalDateTime date2 = LocalDateTime.parse(dateToday, dtf);
        long difference = ChronoUnit.DAYS.between(date1, date2);
        System.out.println("Days: " + difference);
    }
}
