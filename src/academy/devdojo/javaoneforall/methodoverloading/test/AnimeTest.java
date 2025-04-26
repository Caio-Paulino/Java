package academy.devdojo.javaoneforall.methodoverloading.test;

import academy.devdojo.javaoneforall.methodoverloading.domain.Anime;

public class AnimeTest {

    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Fairy Tail", "TV");
        anime.print();
    }
}
