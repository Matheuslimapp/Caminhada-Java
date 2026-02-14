package javacore.Dconstrutores.test;


import javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Haikyuu","TV", 12,"Ação");
        Anime anime1 = new Anime();
        anime.imprime();
    }
}
