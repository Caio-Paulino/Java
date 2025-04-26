package academy.devdojo.javaoneforall.association.domain;

public class Seminar {

    private String title;
    private Local local;
    private Student[] students;

    public Seminar(String title) {
        this.title = title;
    }

    public Seminar(String title, Local local) {
        this.title = title;
        this.local = local;
    }

    public Seminar(String title, Local local, Student[] students) {
        this.title = title;
        this.local = local;
        this.students = students;
    }

    public void printSeminar() {
//        System.out.println("Seminar title" + this.title);
        System.out.println("Seminar local: " + local.getAddress());
        for (Student student: students) {
            System.out.println("Student name: " + student.getName());
            System.out.println("Student age: " + student.getAge());
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
