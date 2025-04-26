package academy.devdojo.javaoneforall.staticmodifier.test;

import academy.devdojo.javaoneforall.staticmodifier.domain.Car;

public class CarTest {
    public static void main(String[] args) {
        System.out.println(Car.getSpeedLimit());
        Car carOne = new Car("BMW", 250);
        Car carTwo = new Car("Mercedes", 280);

        carOne.print();
        Car.setSpeedLimit(120);
        carTwo.print();
    }
}
