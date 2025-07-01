package academy.devdojo.javaoneforall.exercises;

import java.util.Random;

public class Exercise21 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomInt = random.nextInt(100);
        System.out.println("Random number: " + randomInt);
    }
}
