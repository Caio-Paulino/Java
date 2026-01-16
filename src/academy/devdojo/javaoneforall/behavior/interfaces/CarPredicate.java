package academy.devdojo.javaoneforall.behavior.interfaces;

import academy.devdojo.javaoneforall.behavior.domain.Car;

public interface CarPredicate {
    boolean test(Car car);
}
