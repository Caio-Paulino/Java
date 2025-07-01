package academy.devdojo.javaoneforall.exercises;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        float weight;
        float height;
        float imc;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the weight in kilograms: ");
        weight = scanner.nextFloat();

        System.out.println("Enter the height in meters: ");
        height = scanner.nextFloat();

        imc = weight / (height * height);

        if (imc < 18.5) {
            System.out.println("Underweight" + imc);
        } else if(imc >= 18.6 && imc <= 24.6 ) {
            System.out.println("Ideal weight! Congratulations!");
        } else if(imc >= 25 && imc <= 29.9) {
            System.out.println("Slightly overweight");
        } else if(imc >= 30 && imc <=34.9) {
            System.out.println("Grade 1 obesity");
        } else if(imc>=35 && imc <= 39.9) {
            System.out.println("Grade 2 obesity");
        } else {
            System.out.println("Grade 3 obesity");
        }
    }
}
