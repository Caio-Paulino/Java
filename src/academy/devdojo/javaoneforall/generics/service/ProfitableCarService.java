package academy.devdojo.javaoneforall.generics.service;

import academy.devdojo.javaoneforall.generics.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class ProfitableCarService {
    private List<Car> availableCars = new ArrayList<>(List.of(new Car("BMW"), new Car("Fusca")));

    public Car retrieveAvailableCar() {
        System.out.println("Retrieving available car");
        Car car = availableCars.remove(0);
        System.out.println("Renting car: " + car);
        System.out.println("Available cars to rent: ");
        System.out.println(availableCars);
        return car;
    }

    public void returnRentalCar(Car car) {
        System.out.println("Returning car: " + car);
        availableCars.add(car);
        System.out.println("Available cars to rent: ");
        System.out.println(availableCars);
    }
}
