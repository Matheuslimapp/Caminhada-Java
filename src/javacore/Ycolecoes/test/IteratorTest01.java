package javacore.Ycolecoes.test;

import javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(4L,"Attack on titan",19.9,3));
        mangas.add(new Manga(5L,"Jojo", 13.0,5));
        mangas.add(new Manga(3L,"berserk",3.2,0));
        mangas.add(new Manga(2L,"pokemon",2.99,2));
        mangas.add(new Manga(1L,"naruto",23.0,3));
        mangas.add(new Manga(6L,"dragon ball",2.99, 0));
//
//        Iterator<Manga> mangaIterator = mangas.iterator();
//        while (mangaIterator.hasNext()){
//            Manga next = mangaIterator.next();
//            if (next.getQuantidade() == 0){
//                mangaIterator.remove();
//            }
//        }
//        System.out.println(mangas);
//        for (Manga manga : mangas) {
//
//        }
        mangas.removeIf(manga -> manga.getQuantidade() == 0);
        System.out.println(mangas);
    }
}
