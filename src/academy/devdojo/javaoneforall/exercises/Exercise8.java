package academy.devdojo.javaoneforall.exercises;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Exercise8 {

    public static void main(String[] args) {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type the first number: ");
        a = scanner.nextInt();

        System.out.println("Type the second number: ");
        b = scanner.nextInt();

        System.out.println("Type the third number: ");
        c = scanner.nextInt();

        if (a == b || b == c || c == a) {
            System.out.println("Numbers need to be different");
        }
        else {
            int bigger=0, middle=0, smaller = 0;

            if (a > b && a > c) {
                bigger = a;
                if (b > c) {
                    middle = b;
                    smaller = c;
                } else {
                    smaller = b;
                    middle = c;
                }
            } else if (b > a && b > c) {
                bigger = b;
                if (a > c) {
                    middle = a;
                    smaller = c;
                } else {
                    smaller = a;
                    middle = c;
                }
            } else if (c > b && c > b) {
                bigger = c;
                if (a > b) {
                    middle = a;
                    smaller = b;
                } else {
                    smaller = a;
                    middle = b;
                }
            }
            System.out.println(bigger + " " +  middle + " " + smaller);
        }
    }

}
