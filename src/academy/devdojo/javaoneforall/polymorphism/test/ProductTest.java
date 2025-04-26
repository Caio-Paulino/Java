package academy.devdojo.javaoneforall.polymorphism.test;

import academy.devdojo.javaoneforall.polymorphism.domain.Computer;
import academy.devdojo.javaoneforall.polymorphism.domain.Tomato;
import academy.devdojo.javaoneforall.polymorphism.service.ProductTaxReport;

public class ProductTest {
    public static void main(String[] args) {
        Computer computer = new Computer("NUC10i7", 1000);
        Tomato tomato = new Tomato("Italian", 5);
        ProductTaxReport.generateComputerTaxReport(computer);
        System.out.println("--------------");
        ProductTaxReport.generateTomatoTaxReport(tomato);

    }
}
