package academy.devdojo.javaoneforall.introduction;

public class ForEach {
    public static void main(String[] args) {
        int[] numbers = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        for (int num: numbers) {
            // variable num runs through the entire numbers variable
            System.out.println(num);
        }
    }
}
