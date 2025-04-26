package academy.devdojo.javaoneforall.introductionClasses.test;

import academy.devdojo.javaoneforall.introductionClasses.domain.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();

        student.name = "Caio";
        student.age = 20;
        student.gender = 'M';

        System.out.println("My name is " + student.name + " and I have " + student.age + " years. I'm a " + student.gender);
    }
}
