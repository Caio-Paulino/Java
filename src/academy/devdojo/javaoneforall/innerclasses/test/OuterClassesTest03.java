package academy.devdojo.javaoneforall.innerclasses.test;

public class OuterClassesTest03 {
    private String name = "Caio";
    static class Nested {
        private String lastName = "Paulino";
        void print() {
            System.out.println(new OuterClassesTest03().name + " " + lastName);
        }
    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();
    }
}
