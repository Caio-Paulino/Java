package academy.devdojo.javaoneforall.exercises;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        float gradeOne, gradeTwo, gradeThree;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first grade: ");
        gradeOne = scanner.nextFloat();

        System.out.println("Enter your second grade: ");
        gradeTwo = scanner.nextFloat();

        System.out.println("Enter your first grade: ");
        gradeThree = scanner.nextFloat();

        float schoolAverage = (gradeOne + gradeTwo + gradeThree) / 3;

        System.out.println("Your school average is " + schoolAverage);
    }
}
