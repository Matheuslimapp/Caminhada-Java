package javacore.Ycolecoes.test;

import javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>();
        mangas.add(new Manga(8L,"Attack on titan",19.9,3));
        mangas.add(new Manga(5L,"Jojo", 13.0,5));
        mangas.add(new Manga(4L,"berserk",3.2,0));
        mangas.add(new Manga(3L,"pokemon",2.99,2));
        mangas.add(new Manga(2L,"naruto",23.0,3));
        mangas.add(new Manga(6L,"dragon ball",2.99, 0));
        mangas.add(new Manga(1L,"dragon ball",2.99, 0));

        for (Manga manga: mangas){
            System.out.println(manga);
        }
    }
}
