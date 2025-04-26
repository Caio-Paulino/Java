package academy.devdojo.javaoneforall.introductionClasses.domain;

public class Student {
    public String name = "Caio";
    public int age;
    public char gender;

    public void addName(String name) {
        name = this.name;
        System.out.println(name);
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.addName("Flávio");
    }
}
