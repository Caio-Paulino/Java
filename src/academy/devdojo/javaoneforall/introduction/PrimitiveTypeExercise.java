package academy.devdojo.javaoneforall.introduction;

import java.time.LocalDate;

public class PrimitiveTypeExercise {

    public static void main(String[] args) {

        String name = "Caio";
        String address = "Rua Marechal Deodoro, 198 - Barueri - SP";
        double salary = 1200.00;
        LocalDate date = LocalDate.now();

        System.out.println("I, " + name + ", living at " + address + ", confirm that I received the salary of " + salary + " on " + date);
    }
}
