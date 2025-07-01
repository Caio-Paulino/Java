package academy.devdojo.javaoneforall.exercises;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        float gradeOne, gradeTwo, gradeThree, gradeFour;
        String name;

        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your name?");
        name = scanner.nextLine();

        System.out.println("Enter your first grade: ");
        gradeOne = scanner.nextFloat();

        System.out.println("Enter your second grade: ");
        gradeTwo = scanner.nextFloat();

        System.out.println("Enter your third grade: ");
        gradeThree = scanner.nextFloat();

        System.out.println("Enter your fourth grade: ");
        gradeFour = scanner.nextFloat();

        float schoolAverage = ( (gradeOne + gradeTwo + gradeThree + gradeFour) / 4);

        if(schoolAverage < 7) {
            System.out.println(name + ", your school average is: " + schoolAverage);
            System.out.println("You failed school!");
        } else {
            System.out.println(name + ", your school average is: " + schoolAverage);
            System.out.println("Congratulations! You passed school!");
        }


    }


}
