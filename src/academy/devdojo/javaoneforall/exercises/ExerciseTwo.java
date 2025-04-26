package academy.devdojo.javaoneforall.exercises;

import java.util.Scanner;

public class ExerciseTwo {
    public static void main(String[] args) {
        int number;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a number");
        number = scanner.nextInt();

        if ((number % 2) == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }

        if(number >= 0) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is negative");
        }
    }
}