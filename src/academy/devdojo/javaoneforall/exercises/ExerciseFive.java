package academy.devdojo.javaoneforall.exercises;

import java.util.Scanner;

public class ExerciseFive {

    public static void main(String[] args) {
        double baseSalary = 1293;

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your salary?");
        double salaryUser = scanner.nextDouble();
        double result = salaryUser / baseSalary;
        System.out.println("You earn " + result + " minimum salary(ies)");
    }
}
