package academy.devdojo.javaoneforall.exercises;

public class Exercise18 {
    public static void main(String[] args) {
        double franciscoHeight = 1.50;
        double saraHeight = 1.10;
        int years = 0;

        while (franciscoHeight > saraHeight) {
            years = years + 1;
            franciscoHeight = franciscoHeight + 0.02;
            saraHeight = saraHeight + 0.03;
        }

        System.out.println("Will be necessary " + years + " years to Sara become higher than Francisco" );
    }
}
