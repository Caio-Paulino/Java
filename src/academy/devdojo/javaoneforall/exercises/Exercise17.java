package academy.devdojo.javaoneforall.exercises;

import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the weather in fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = (5 *(fahrenheit - 32) / 9);
        System.out.println("Celsius: " + celsius);
        System.out.println("Fahrenheit: " + fahrenheit);

    }
}
