package academy.devdojo.javaoneforall.exercises;

import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {
        int a, b, c;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a value A");
        a = scanner.nextInt();
        System.out.println("Write a value B");
        b = scanner.nextInt();

        if(a == b) {
            c = a + b;
            System.out.println(c);
        } else {
            c = a * b;
            System.out.println(c);
        }
    }
}
