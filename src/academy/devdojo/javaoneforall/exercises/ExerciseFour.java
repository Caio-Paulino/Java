package academy.devdojo.javaoneforall.exercises;

import java.util.Scanner;

public class ExerciseFour {

    public static void main(String[] args) {
        int number, sucessor, predecessor;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digit a number");
        number = scanner.nextInt();
        sucessor = number + 1;
        predecessor = number - 1;
        System.out.println("Sucessor: " + sucessor);
        System.out.println("Predecessor" + predecessor);


    }
}
