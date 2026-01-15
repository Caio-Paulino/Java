package academy.devdojo.javaoneforall.innerclasses.test;

import java.sql.Struct;

public class OuterClassesTest02 {
    private String name = "Midoriya";
    void print(String param) {
        final String lastName = "Izuku";

        class LocalClass {
            public void printLocal() {
                System.out.println(param);
                System.out.println(name + " " + lastName);
            }
        }
        LocalClass local = new LocalClass();
        local.printLocal();
    }

    public static void main(String[] args) {
        OuterClassesTest02 outer = new OuterClassesTest02();
        outer.print();
    }

    private void print() {
    }
}
