package academy.devdojo.javaoneforall.inheritance.test;

import academy.devdojo.javaoneforall.inheritance.domain.Address;
import academy.devdojo.javaoneforall.inheritance.domain.Employee;
import academy.devdojo.javaoneforall.inheritance.domain.Manager;

public class InheritanceTestOne {
    public static void main(String[] args) {
        Address address = new Address();
        address.setStreet("12th Av");
        address.setZipcode("12345");

        Employee employee = new Employee("Caio");
        employee.setName("Tohohisa");
        employee.setSocialSecurityNumber("1222222");
        employee.setSalary(12000);
        employee.setAddress(address);
        employee.print();
        System.out.println("--------");
        Manager manager = new Manager("Ailton");
        manager.setSocialSecurityNumber("123456789");
        manager.setSalary(50000);
        manager.setAddress(address);
        manager.setDepartment("Risco");
        manager.print();
    }
}
