package academy.devdojo.javaoneforall.association.domain;

public class Student {

    private String name;
    private int age;
    private Seminar seminar;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void print() {
        System.out.println(this.name);
        System.out.println(this.age);
        if(seminar != null) {
            System.out.println(seminar.getTitle());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Seminar getSeminar() {
        return seminar;
    }

    public void setSeminar(Seminar seminar) {
        this.seminar = seminar;
    }
}
