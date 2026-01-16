package academy.devdojo.javaoneforall.behavior.test;

import academy.devdojo.javaoneforall.behavior.domain.Car;
import academy.devdojo.javaoneforall.behavior.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;

public class BehaviorByParameterTest02 {
    private static List<Car> cars = List.of(
            new Car("green", 2011),
            new Car("black", 1998),
            new Car("red", 2019));

    public static void main(String[] args) {
//        List<Car> greenCars = filter(cars, new CarPredicate() {
//            @Override
//            public boolean test(Car car) {
//                return car.getColor().equals("green");
//            }
//        });
        List<Car> greenCars = filter(cars, car -> car.getColor().equals("green"));
        System.out.println(greenCars);
    }

    private static List<Car> filter(List<Car> cars, CarPredicate carPredicate) {
        List<Car> filteredCar = new ArrayList<>();
        for (Car car : cars) {
            if (carPredicate.test(car)) {
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }
}
