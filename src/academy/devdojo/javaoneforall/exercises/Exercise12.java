package academy.devdojo.javaoneforall.exercises;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        float productValue;
        int paymentMethod;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the product value: ");
        productValue = scanner.nextFloat();

        System.out.println("Choose the payment method: " + "/n");
        System.out.println("1 - Cash payment in money or Pix");
        System.out.println("2 - Cash payment in credit card");
        System.out.println("3 - Payments in two installments");
        System.out.println("4 - Payments in three installments or more");
        paymentMethod = scanner.nextInt();

        if(paymentMethod == 1) {
            float discount = productValue * 15/100;
            productValue = productValue - discount;
            System.out.println("The product value is " + productValue);
        } else if(paymentMethod == 2) {
            float discount = productValue * 10/100;
            productValue = productValue - discount;
            System.out.println("The product value is " + productValue);
        } else if(paymentMethod == 3) {
            System.out.println("The product value is " + productValue);
        } else if(paymentMethod == 4) {
            float fees = productValue * 10/100;
            productValue = productValue + fees;
            System.out.println("The product value is " + productValue);
        }
    }
}
