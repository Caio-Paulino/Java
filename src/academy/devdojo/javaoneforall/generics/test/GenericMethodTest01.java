package academy.devdojo.javaoneforall.generics.test;

import academy.devdojo.javaoneforall.generics.domain.Boat;

import java.util.Arrays;
import java.util.List;

public class GenericMethodTest01 {
    public static void main(String[] args) {
        printArray(new Boat("Canoa furada"));
    }

    private static <T> void printArray(T t) {
        List<T> list = List.of(t);
        System.out.println(list);
    }

//    private static <T extends Comparable<T>> List<T> printArray(T t) {
//        return List.of(t);
//    }
}
