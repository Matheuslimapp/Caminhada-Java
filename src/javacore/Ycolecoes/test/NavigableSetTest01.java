package javacore.Ycolecoes.test;
import javacore.Ycolecoes.dominio.Manga;
import javacore.Ycolecoes.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;
class SmartphoneMarcaComparator implements Comparator<Smartphone>{

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

class MangaPrecoComparator implements Comparator<Manga>{

    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}
public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet(new SmartphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);
        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());
        mangas.add(new Manga(8L,"Attack on titan",19.9,3));
        mangas.add(new Manga(5L,"Jojo", 13.0,5));
        mangas.add(new Manga(3L,"pokemon",2.99,2));
        mangas.add(new Manga(2L,"naruto",23.0,3));
        mangas.add(new Manga(6L,"dragon ball",3.2, 0));
        mangas.add(new Manga(10L,"one piece",2.99, 8));
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga jojo = new Manga(21L, "Jojo 3", 3.2, 5);
        //Lower <
        //floor <=
        // higher >
        // ceiling >=
        System.out.println("------------");
        System.out.println(mangas.lower(jojo));
        System.out.println(mangas.floor(jojo));
        System.out.println(mangas.higher(jojo));
        System.out.println(mangas.ceiling(jojo));

        System.out.println(mangas.size());
//        System.out.println(mangas.pollFirst());
        System.out.println(mangas.pollLast());
        System.out.println(mangas.size());

    }
}
