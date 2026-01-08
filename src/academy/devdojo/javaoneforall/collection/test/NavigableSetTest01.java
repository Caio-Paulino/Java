package academy.devdojo.javaoneforall.collection.test;

import academy.devdojo.javaoneforall.collection.domain.Manga;
import academy.devdojo.javaoneforall.collection.domain.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneNameComparator implements Comparator<Smartphone> {
    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class MangaPriceComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPrice(), o2.getPrice());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneNameComparator());
        set.add(new Smartphone("111", "LG"));
        System.out.println(set);
        NavigableSet<Manga> mangas = new TreeSet<>();
        mangas.add(new Manga(5L, "Pokemon", 19.99, 0));
        mangas.add(new Manga(3L, "Hellsing Ultimate", 59.99, 5));
        mangas.add(new Manga(1L, "Berserk", 29.99, 0));
        mangas.add(new Manga(2L, "Attack on Titan", 39.99, 8));
        mangas.add(new Manga(4L, "Dragon Ball Z", 89.99, 0));
        mangas.add(new Manga(10L, "Slime", 1.99, 0));

        // mangas.descendingSet()
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga yuyuHakusho = new Manga(11L, "YuyuHakusho", 2.99, 5);

        // lower <
        // floor <=
        // higher >
        // ceiling >=
        System.out.println("----------");
        System.out.println(mangas.lower(yuyuHakusho));

        System.out.println(mangas.size());
    }
}
