package academy.devdojo.javaoneforall.introductionmethods.test;

import academy.devdojo.javaoneforall.introductionmethods.domain.Employee;
import academy.devdojo.javaoneforall.introductionmethods.domain.PrintData;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.setName("Ronaldo");
        employee.setAge(32);
        employee.setSalary(new double[] {1200.0, 1500.0, 1800.0});;
        
        PrintData printer = new PrintData();
        printer.printData(employee);
    }
}
