package javacore.ZZEstreams.test;

import javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamsTest03 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overlod", 3.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No Game no life", 2.99),
            new LightNovel("Fullnelal Alcheisl", 5.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Mongatari", 4.00)
    ));
    public static void main(String[] args) {
        Stream<LightNovel> stream = lightNovels.stream();
        lightNovels.stream().forEach(System.out::println);
        //long count = stream.filter(ln -> ln.getPrice() <= 4).count();
        //Se voce fechar uma stream e tenta utilizar denovo vai ter uma exeção
        // pra evitar so bastar voce colocar o nome da fonte de dados no caso aqui lightNovels.stream()
        long count = lightNovels.stream().
                distinct()
                .filter(ln -> ln.getPrice() <= 4)
                .count();
        System.out.println(count);
    }
}
