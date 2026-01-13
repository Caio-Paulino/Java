package academy.devdojo.javaoneforall.generics.test;

import academy.devdojo.javaoneforall.generics.domain.Boat;
import academy.devdojo.javaoneforall.generics.domain.Car;
import academy.devdojo.javaoneforall.generics.service.ProfitableBoatService;
import academy.devdojo.javaoneforall.generics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class GenericClassTest03 {
    public static void main(String[] args) {
        List<Boat> availableBoat = new ArrayList<>(List.of(new Boat("Speedboat"), new Boat("Canoe")));
        List<Car> availableCars = new ArrayList<>(List.of(new Car("BMW"), new Car("Fusca")));
        RentalService<Car> rentalService = new RentalService<>(availableCars);
        Car car = rentalService.retrieveAvailableObject();
        System.out.println("Using car for one month...");
        rentalService.returnRentalObject(car);
    }
}
