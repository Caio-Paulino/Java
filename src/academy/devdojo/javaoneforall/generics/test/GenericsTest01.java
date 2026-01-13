package academy.devdojo.javaoneforall.generics.test;

import academy.devdojo.javaoneforall.collection.domain.Customer;

import java.util.ArrayList;
import java.util.List;


public class GenericsTest01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Midoriya");

        for (String o : list) {
            System.out.println(o);
        }

        add(list, new Customer("Jiraya"));

        for (String o : list) {
            System.out.println(o);
        }
    }

    private static void add(List anyList, Customer c) {
        anyList.add(c);
    }
}
