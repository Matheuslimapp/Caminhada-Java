package javacore.Ycolecoes.test;

import javacore.Ycolecoes.dominio.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Manga> mangas = new PriorityQueue<>(new MangaPrecoComparator().reversed());
        mangas.add(new Manga(8L,"Attack on titan",19.9,3));
        mangas.add(new Manga(5L,"Jojo", 13.0,5));
        mangas.add(new Manga(3L,"pokemon",2.99,2));
        mangas.add(new Manga(2L,"naruto",23.0,3));
        mangas.add(new Manga(6L,"dragon ball",3.2, 0));

        while (!mangas.isEmpty()){
            System.out.println(mangas.poll());
        }
    }
}
