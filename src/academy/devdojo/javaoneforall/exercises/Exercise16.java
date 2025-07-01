package academy.devdojo.javaoneforall.exercises;

import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {

        int a, b, c;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first value of the triangle: ");
        a = scanner.nextInt();
        System.out.println("Enter the second value of the triangle: ");
        b = scanner.nextInt();
        System.out.println("Enter the third value of the triangle: ");
        c = scanner.nextInt();

        if(a == b && a == c) {
            System.out.println("The triangle is equilateral");
        } else if(a == b || a == c) {
        System.out.println("The triangle is isosceles");
        } else {
            System.out.println("The triangle is scalene");
        }
    }
}
