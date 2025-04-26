package academy.devdojo.javaoneforall.association.test;

import java.util.Scanner;

public class InputKeyboardDataTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please type your name: ");
        String name = input.nextLine();
        System.out.println("Please type your age: ");
        int age = input.nextInt();

        System.out.println("Data: \n" + "Name: " + name + "\n" + "Age: " + age);
    }
}
