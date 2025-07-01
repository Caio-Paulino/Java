package academy.devdojo.javaoneforall.exercises;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        int a, b, c;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a value for A");
        a = scanner.nextInt();

        System.out.println("Write a value for B");
        b = scanner.nextInt();

        System.out.println("Write a value for C");
        c = scanner.nextInt();

        int sum = a + b;
        System.out.println(sum);

        if(sum>c) {
            System.out.println("Sum of A + B is greater than C");
        } else {
            System.out.println("Sum of A + B is lower than C");
        }

    }
}
