package javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList(16); //1.4
        List<String> nomes2 = new ArrayList(16);
        nomes.add("Matheus");
        nomes.add("DevDojo");
        nomes2.add("suane");
        nomes2.add("Academy");

        //System.out.println(nomes.remove("Matheus"));
        nomes.addAll(nomes2);

        for (String nome: nomes){
            System.out.println(nome);
        }

        System.out.println("-------------");
        int size = nomes.size();
        for (int i = 0; i < size; i++){
            nomes.add("Suane");
            System.out.println(nomes.get(i));
        }
        System.out.println(nomes);

        List<Integer> numeros = new ArrayList<>();//Lista tem que ser objeto
        numeros.add(1);

    }
}
