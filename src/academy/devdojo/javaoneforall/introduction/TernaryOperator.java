package academy.devdojo.javaoneforall.introduction;

public class TernaryOperator {

    public static void main(String[] args) {
        double salary = 3500D;
        String shouldBuyMessage = "buy PS5";
        String shouldNotBuyMessage = "don't buy PS5";
        // ternary (condition) ? true : false
        String displayMessage = salary > 2000D ? shouldBuyMessage : shouldNotBuyMessage;
        System.out.println(displayMessage);
    }


}
