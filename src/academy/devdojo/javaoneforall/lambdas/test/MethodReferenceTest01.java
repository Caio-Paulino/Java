package academy.devdojo.javaoneforall.lambdas.test;

import academy.devdojo.javaoneforall.lambdas.domain.Anime;
import academy.devdojo.javaoneforall.lambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Reference to a static method
public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 43), new Anime("One Piece", 900), new Anime("Naruto", 500)));
//        Collections.sort(animeList, (a1, a2) -> a1.getName().compareTo(a2.getName()));
        Collections.sort(animeList, AnimeComparators::compare);
        System.out.println(animeList);
    }
}
