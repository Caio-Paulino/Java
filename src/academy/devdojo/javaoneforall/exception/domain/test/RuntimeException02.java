package academy.devdojo.javaoneforall.exception.domain.test;

public class RuntimeException02 {
    public static void main(String[] args) {
        System.out.println(division(1,0));

        System.out.println("Finished successfully");
    }

    /**
     *
     * @param a
     * @param b cannot be zero
     * @return
     * @throws IllegalArgumentException if b is zero
     */

    private static int division(int a, int b) {
        if(b == 0) {
            throw new IllegalArgumentException("The second parameter can't be 0");
        }

        return a / b;
    }
}
