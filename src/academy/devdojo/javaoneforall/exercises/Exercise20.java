package academy.devdojo.javaoneforall.exercises;

import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number for multiplication table: ");
        int number = scanner.nextInt();
        for(int i=1; i<=10; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result + "\n");
        }
    }
}
