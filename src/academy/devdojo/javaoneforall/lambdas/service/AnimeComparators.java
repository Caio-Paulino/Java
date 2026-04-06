package academy.devdojo.javaoneforall.lambdas.service;

import academy.devdojo.javaoneforall.lambdas.domain.Anime;

public class AnimeComparators {
    public static int compare(Anime anime1, Anime anime2) {
        return anime1.getName().compareTo(anime2.getName());
    }
    public static int compareByEpisodes(Anime anime1, Anime anime2) {
        return Integer.compare(anime1.getEpisodes(), anime2.getEpisodes());
    }

    public int compareByEpisodesNonStatic(Anime anime1, Anime anime2) {
        return Integer.compare(anime1.getEpisodes(), anime2.getEpisodes());
    }
}
