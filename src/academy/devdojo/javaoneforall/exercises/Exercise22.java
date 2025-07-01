package academy.devdojo.javaoneforall.exercises;

import java.util.Scanner;

public class Exercise22 {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter A value: ");
        a = scanner.nextInt();
        System.out.print("Enter B value: ");
        b = scanner.nextInt();

        int quotient = a / b;
        int remainder = a % b;

        System.out.println("Quotient: " + quotient + "\n");
        System.out.println("Remainder: " + remainder);
    }
}
