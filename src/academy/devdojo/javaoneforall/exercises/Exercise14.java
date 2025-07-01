package academy.devdojo.javaoneforall.exercises;

import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the a value: ");
        a = scanner.nextInt();
        System.out.println("Enter the b value: ");
        b = scanner.nextInt();

        int support = a;
        a = b;
        b = support;

        System.out.println("a value is " + a + " and b value is " + b);
    }
}
