package academy.devdojo.javaoneforall.exercises;

import java.util.Scanner;

public class Exercise24 {
    public static void main(String[] args) {
        double timeTravel;
        double averageSpeed;
        double distanceTravel;
        double litersTravel;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter distance travel: ");
        distanceTravel = scanner.nextDouble();

        litersTravel = distanceTravel / 12;

        System.out.println("Liters spent on the travel: " + litersTravel);



    }
}
