package academy.devdojo.javaoneforall.collection.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
//        List names = new ArrayList(); // 1.4
//        names.add("John");
//        names.add("Emilly");

        List<String> names = new ArrayList<>();
        List<String> names2 = new ArrayList<>();

        names.add("Caio");
        names.add("Devdojo");
        names2.add("Paulino");
        names2.add("Academy");

        names.addAll(names2);

        for (String name : names) {
            System.out.println(name);
        }
    }
}
