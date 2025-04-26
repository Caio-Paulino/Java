package academy.devdojo.javaoneforall.introductionClasses.test;

import academy.devdojo.javaoneforall.introductionClasses.domain.Car;

public class CarTest {
    public static void main(String[] args) {
        Car carOne = new Car();

        carOne.name = "HRV";
        carOne.model = "EX";
        carOne.year = "2019";

        Car carTwo = new Car();

        carTwo.name = "Pajero Dakar";
        carTwo.model = "HPE";
        carTwo.year = "2013";

        System.out.println("First car: " + "\n" + "Name: " + carOne.name + " - Model: " + carOne.model + " - Year: " + carOne.year);

        System.out.println("--------------------");

        System.out.println("Second car: " + "\n" + "Name: " + carTwo.name + " - Model: " + carTwo.model + " - Year: " + carTwo.year);
    }
}
