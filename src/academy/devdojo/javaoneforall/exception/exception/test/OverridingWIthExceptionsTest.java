package academy.devdojo.javaoneforall.exception.exception.test;

import academy.devdojo.javaoneforall.exception.domain.Employee;
import academy.devdojo.javaoneforall.exception.domain.LoginInvalidException;
import academy.devdojo.javaoneforall.exception.domain.Person;

import java.io.FileNotFoundException;

public class OverridingWIthExceptionsTest {
    public static void main(String[] args) {
        Person person = new Person();
        try {
            person.save();
        } catch (LoginInvalidException | FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Employee employee = new Employee();
        employee.save();
    }
}
