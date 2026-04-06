package academy.devdojo.javaoneforall.optional.test;

import academy.devdojo.javaoneforall.optional.domain.Manga;
import academy.devdojo.javaoneforall.optional.repository.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {
        Optional<Manga> mangabyTitle = MangaRepository.findByTitle("Boku no hero");
        mangabyTitle.ifPresent(m -> m.setTitle("Boku no hero 5"));
        System.out.println(mangabyTitle);

        Manga mangaById = MangaRepository.findById(2)
                .orElseThrow(IllegalArgumentException::new);
        System.out.println(mangaById);

        Manga newManga = MangaRepository.findByTitle("Drifters").orElse(new Manga(3,"Drifters", 20));
        System.out.println(newManga);
    }
}
