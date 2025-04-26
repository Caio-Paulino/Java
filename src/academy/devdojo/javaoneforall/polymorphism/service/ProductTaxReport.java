package academy.devdojo.javaoneforall.polymorphism.service;

import academy.devdojo.javaoneforall.polymorphism.domain.Computer;
import academy.devdojo.javaoneforall.polymorphism.domain.Tomato;

public class ProductTaxReport {

    public static void generateComputerTaxReport(Computer computer) {
        System.out.println("Starting the report from Computer");
        double taxValue = computer.calculateTaxValue();
        System.out.println("Computer " + computer.getName());
        System.out.println("Price " + computer.getPrice());
        System.out.println("Tax value " + taxValue);
    }

    public static void generateTomatoTaxReport(Tomato tomato) {
        System.out.println("Starting the report from Tomato");
        double taxValue = tomato.calculateTaxValue();
        System.out.println("Tomato " + tomato.getName());
        System.out.println("Price " + tomato.getPrice());
        System.out.println("Tax value " + taxValue);
    }
}
