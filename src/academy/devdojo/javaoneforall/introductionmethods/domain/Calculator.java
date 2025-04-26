package academy.devdojo.javaoneforall.introductionmethods.domain;

public class Calculator {

    public void sumTwoNumbers() {
        System.out.println(10 + 10);
    }

    public void multiplyTwoNumbers(int numberOne, int numberTwo) {
        System.out.println(numberOne*numberTwo);
    }

    public double divideTwoNumbers(double numOne, double numTwo) {
        if (numTwo == 0) {
            return 0;
        }   
        return numOne/numTwo;
    }
}
