package academy.devdojo.javaoneforall.introductionmethods.test;

import academy.devdojo.javaoneforall.introductionmethods.domain.Calculator;

public class CalculatorTestTwo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double result = calculator.divideTwoNumbers(20, 2);
        System.out.println(result);
    }
}
