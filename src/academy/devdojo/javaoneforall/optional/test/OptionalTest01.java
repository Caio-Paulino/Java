package academy.devdojo.javaoneforall.optional.test;

import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    public static void main(String[] args) {
        Optional<String> o1 = Optional.of("Hello William, awesome course");
        Optional<String> o2 = Optional.ofNullable(null);
        Optional<String> o3 = Optional.empty();
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        System.out.println("------");
        Optional<String> name = findName("Caio");
        System.out.println(name.orElse("EMPTY"));
        name.ifPresent(s -> System.out.println(s.toUpperCase()));
        findName("Caio").orElseThrow(IllegalArgumentException::new);

     }

    private static Optional<String> findName(String name) {
        List<String> list = List.of("Caio", "Dev Dojo");
        int i = list.indexOf(name);
        if (i != -1) {
            return Optional.of(list.get(i));
        }
        return Optional.empty();
    }
}
