package academy.devdojo.javaoneforall.exercises;

import java.util.Scanner;

public class ExerciseSeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a value to tell if is higher than 10");
        int numberOne = scanner.nextInt();
        System.out.println(numberOne>10);

        System.out.println("Type a value to tell if is higher than 10");
        int numberTwo = scanner.nextInt();
        System.out.println(numberTwo>10);
    }
}
