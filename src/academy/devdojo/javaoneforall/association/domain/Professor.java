package academy.devdojo.javaoneforall.association.domain;

public class Professor {

    private String name;
    private String researchField;
    private Seminar[] seminars;

    public Professor(String name, String researchField, Seminar[] seminars) {
        this.name = name;
        this.researchField = researchField;
        this.seminars = seminars;
    }

    public void printProfessor() {
        System.out.println("Professor name: " + this.name);
        System.out.println("Research field: " + this.researchField);
        for(Seminar seminar: seminars) {
            System.out.println("Seminar title: " + seminar.getTitle());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResearchField() {
        return researchField;
    }

    public void setResearchField(String researchField) {
        this.researchField = researchField;
    }
}
