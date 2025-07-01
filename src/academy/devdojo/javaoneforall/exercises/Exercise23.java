package academy.devdojo.javaoneforall.exercises;

import java.util.Scanner;

public class Exercise23 {
    public static void main(String[] args) {
        double classHourPrice;
        int numberOfClasses;
        double discount;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of classes per hour: ");
        classHourPrice = scanner.nextDouble();
        System.out.println("Enter the number of classes: ");
        numberOfClasses = scanner.nextInt();

        double salary = classHourPrice * numberOfClasses;

        if (salary <= 1518) {
            discount = salary * 7.5 / 100;
            salary = salary - discount;
            System.out.println("The salary is $" + salary);
        } else if (salary > 1518 && salary <= 2793.88) {
            discount = salary * 9 / 100;
            salary = salary - discount;
            System.out.println("The salary is $" + salary);
        } else if (salary > 2793.89 && salary <= 4190.83) {
            discount = salary * 12 / 100;
            salary = salary - discount;
            System.out.println("The salary is $" + salary);
        } else {
            discount = salary * 14 / 100;
            salary = salary - discount;
            System.out.println("The salary is $" + salary);
        }

    }
}
