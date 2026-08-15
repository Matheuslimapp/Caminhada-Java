package javacore.ZZDopitional.test;

import javacore.ZZDopitional.dominio.Manga;
import javacore.ZZDopitional.repositorio.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {
        Optional<Manga> mangaByTitle = MangaRepository.findByTitle("Naruto");
        mangaByTitle.ifPresent(m -> m.setTitle("Naruto shipuden"));
        System.out.println(mangaByTitle);

        Manga mangaById= MangaRepository.findById(2)
                .orElseThrow(IllegalArgumentException::new);
        System.out.println(mangaById);

        Manga newManga = MangaRepository.findByTitle("Drifters")
                .orElseGet(() -> new Manga(3, "Drifters", 20));
        System.out.println(newManga);

    }
}
