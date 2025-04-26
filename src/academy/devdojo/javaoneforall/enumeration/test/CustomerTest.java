package academy.devdojo.javaoneforall.enumeration.test;

import academy.devdojo.javaoneforall.enumeration.domain.Customer;
import academy.devdojo.javaoneforall.enumeration.domain.CustomerType;
import academy.devdojo.javaoneforall.enumeration.domain.PaymentType;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Tsubasa", CustomerType.INDIVIDUAL, PaymentType.DEBIT);
        Customer customer2 = new Customer("Akira", CustomerType.COMPANY, PaymentType.CREDIT);


        System.out.println(customer1);
        System.out.println(customer2);

    }
}
