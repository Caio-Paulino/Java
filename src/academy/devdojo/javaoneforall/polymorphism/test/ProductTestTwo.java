package academy.devdojo.javaoneforall.polymorphism.test;

import academy.devdojo.javaoneforall.polymorphism.domain.Computer;
import academy.devdojo.javaoneforall.polymorphism.domain.Product;

public class ProductTestTwo {
    public static void main(String[] args) {
        Product product = new Computer("Ryzen 9", 1000);
        System.out.println(product.getName());
        System.out.println(product.getPrice());
        System.out.println(product.calculateTaxValue());
     }
}
