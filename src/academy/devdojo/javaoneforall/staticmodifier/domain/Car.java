package academy.devdojo.javaoneforall.staticmodifier.domain;

public class Car {
    public String name;
    public double maxSpeed;
    private static double speedLimit = 300;

    public Car(String name, double maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    public void print() {
        System.out.println("Name car: " + this.name);
        System.out.println("Max speed: " + this.maxSpeed);
        System.out.println("Speed limit: " + this.speedLimit);
        System.out.println("-----------");
    }

    public static double getSpeedLimit() {
        return Car.speedLimit;
    }

    public static void setSpeedLimit(double speedLimit) {
        Car.speedLimit = speedLimit;
    }
 }

