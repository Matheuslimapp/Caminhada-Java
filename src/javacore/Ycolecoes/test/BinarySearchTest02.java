package javacore.Ycolecoes.test;

import javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        MangaByIdComparator mangaByIdComparator = new MangaByIdComparator();
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(4L,"Attack on titan",19.9));
        mangas.add(new Manga(6L,"dragon ball",2.99));
        mangas.add(new Manga(5L,"Jojo", 13.0));
        mangas.add(new Manga(3L,"berserk",3.2));
        mangas.add(new Manga(2L,"pokemon",2.99));
        mangas.add(new Manga(1L,"naruto",23.0));
        //(-(ponto de inserção) -1)
        // index 0,1,2,3
        //value 0,1,2,3,4
//        Collections.sort(mangas);
        mangas.sort(mangaByIdComparator);
        for (Manga manga: mangas){
            System.out.println(manga);
        }

        Manga mangaTosSearch = new Manga(2L, "dragon ball", 2.99);
        System.out.println(Collections.binarySearch(mangas, mangaTosSearch, mangaByIdComparator));
    }
}
