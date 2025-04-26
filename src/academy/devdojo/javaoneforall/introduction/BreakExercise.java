package academy.devdojo.javaoneforall.introduction;

public class BreakExercise {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 2) {
                continue;
            }
            System.out.println("i: " + i);
        }
        System.out.println("Out of the loop");
    }
}