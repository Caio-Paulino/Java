package academy.devdojo.javaoneforall.lambdas.test;

import academy.devdojo.javaoneforall.lambdas.domain.Anime;
import academy.devdojo.javaoneforall.lambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest02 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 43), new Anime("One Piece", 900), new Anime("Naruto", 500)));
        animeList.sort(animeComparators::compareByEpisodesNonStatic);
        System.out.println(animeList);
    }
}
