package academy.devdojo.javaoneforall.behavior.domain;

public class Car {
    private String name = "Audi";
    private String color;
    private int year;

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }

    public Car(String color, int year) {
        this.color = color;
        this.year = year;
    }
}
