package javacore.Ycolecoes.test;

import javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("Attack on titan");
        mangas.add("Jojo");
        mangas.add("berserk");
        mangas.add("pokemon");
        mangas.add("naruto");
        mangas.add("dragon ball");
        Collections.sort(mangas);//ordem alfabetica

        List<Double> dinheriros = new ArrayList<>();
        dinheriros.add(100.23);
        dinheriros.add(1430.23);
        dinheriros.add(450.50);
        dinheriros.add(940.090);

        for (String manga : mangas) {
            System.out.println(manga);
        }
        System.out.println(dinheriros);
        Collections.sort(dinheriros);
        System.out.println(dinheriros);

        new Manga(null,null,0);
    }
}
