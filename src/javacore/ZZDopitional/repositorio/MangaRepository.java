package javacore.ZZDopitional.repositorio;

import javacore.ZZDopitional.dominio.Manga;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepository {
    private static List<Manga> mangas = List.of(new Manga(1,"Naruto", 500), new Manga(2,"Boku no hero", 50));
    // 1 method - title
    // 2 method - id
    public static Optional<Manga> findById(Integer id){
        return findBy(m -> m.getId().equals(id));
    }

    public static Optional<Manga> findByTitle(String title){
       return findBy(m -> m.getTitle().equals(title));
    }
    public static Optional <Manga> findBy(Predicate<Manga> predicate){
        Manga found = null;
        for (Manga manga : mangas) {
            if (predicate.test(manga)){
                found = manga;
            }
        }
        return Optional.ofNullable(found);
    }
}
