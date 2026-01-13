package academy.devdojo.javaoneforall.generics.service;

import academy.devdojo.javaoneforall.generics.domain.Car;

import java.util.List;

public class RentalService<T> {

    private List<T> availableObjects;

    public RentalService(List<T> availableObjects) {
        this.availableObjects = availableObjects;
    }

    public T retrieveAvailableObject() {
        System.out.println("Retrieving available object");
        T t = availableObjects.remove(0);
        System.out.println("Renting object: " + t);
        System.out.println("Available object to rent: ");
        System.out.println(availableObjects);
        return t;
    }

    public void returnRentalObject(T t) {
        System.out.println("Returning objects: " + t);
        availableObjects.add(t);
        System.out.println("Available objects to rent: ");
        System.out.println(availableObjects);
    }
}
