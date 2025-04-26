package academy.devdojo.javaoneforall.exercises;

import java.util.Scanner;

public class ExerciseSix {
    public static void main(String[] args) {
        double number;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a number");
        number = scanner.nextDouble();
        double result = number + number * 5 / 100;
        System.out.println("Value with readjustment: " + result);
    }
}
