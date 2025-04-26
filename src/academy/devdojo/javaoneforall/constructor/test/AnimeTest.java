package academy.devdojo.javaoneforall.constructor.test;

import academy.devdojo.javaoneforall.constructor.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime("Jujutsu Kaisen", "Crunchyroll", 84);
        anime.print();
        
        Anime animeTwo = new Anime();
        animeTwo.print();
    }
}
