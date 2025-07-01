package academy.devdojo.javaoneforall.exercises;

public class Exercise19 {
    public static void main(String[] args) {
        int number = 1;
        do {
            for(int i=1; i<=10; i++) {
                int result = number * i;
                System.out.println(number + " x " + i + " = " + result + "\n");
            }
            number++;
        } while (number <= 10);
    }
}
