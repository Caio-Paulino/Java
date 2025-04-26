package academy.devdojo.javaoneforall.association.test;

import academy.devdojo.javaoneforall.association.domain.Local;
import academy.devdojo.javaoneforall.association.domain.Professor;
import academy.devdojo.javaoneforall.association.domain.Seminar;
import academy.devdojo.javaoneforall.association.domain.Student;

import java.util.Scanner;

public class SeminarTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Student student = new Student("Caio", 19);
        Student studentOne = new Student("Camila", 21);
        Student[] students = {student, studentOne};

        Local local = new Local("Arizona");

        Seminar seminar = new Seminar("Olympics", local, students);
        Seminar seminarTwo = new Seminar("Ancient Greece");
        Seminar[] seminars = {seminar, seminarTwo};
//        seminar.print();


        Professor professor = new Professor("Erivelton", "History", seminars);
        professor.printProfessor();

        seminar.printSeminar();

//        System.out.println("What is the title of the seminar?");
//        Seminar seminar = new Seminar(in.nextLine());
//
    }
}
