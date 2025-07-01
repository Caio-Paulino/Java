package academy.devdojo.javaoneforall.exercises;

import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        String name;
        int age;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = scanner.nextLine();
        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        if(age >= 18) {
            System.out.println(name + ", you are of legal age");
        } else {
            System.out.println(name + ", you are not of legal age");
        }
    }
}
