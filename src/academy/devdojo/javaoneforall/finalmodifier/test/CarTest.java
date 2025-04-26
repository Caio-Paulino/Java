package academy.devdojo.javaoneforall.finalmodifier.test;

import academy.devdojo.javaoneforall.finalmodifier.domain.Car;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(Car.SPEED_LIMIT);
        System.out.println(car.BUYER);
        car.BUYER.setName("Vegeta");
        System.out.println(car.BUYER);
    }
}
