package academy.devdojo.javaoneforall.lambdas.test;

import academy.devdojo.javaoneforall.lambdas.domain.Anime;
import academy.devdojo.javaoneforall.lambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

// Reference to a constructor
public class MethodReference04 {
    public static void main(String[] args) {
        Supplier<AnimeComparators> animeComparatorsSupplier = () -> new AnimeComparators();
        AnimeComparators animeComparators = animeComparatorsSupplier.get();
        List<Anime> animes = new ArrayList<>(List.of(new Anime("Berserk", 43), new Anime("One Piece", 900), new Anime("Naruto", 500)));
        animes.sort(animeComparators::compareByEpisodesNonStatic);
        System.out.println(animes);
        BiFunction<String,Integer, Anime> animeBiFunction = (title,episodes) -> new Anime(title, episodes);
        System.out.println(animeBiFunction.apply("Saint Seiya", 100));
    }
}
