package academy.devdojo.javaoneforall.generics.test;

import academy.devdojo.javaoneforall.generics.domain.Car;
import academy.devdojo.javaoneforall.generics.service.ProfitableCarService;

public class GenericClassTest01 {
    public static void main(String[] args) {
        ProfitableCarService profitableCarService = new ProfitableCarService();
        Car car = profitableCarService.retrieveAvailableCar();
        System.out.println("Using car for one month...");
        profitableCarService.returnRentalCar(car);
    }
}
