package javacore.Ycolecoes.test;

import javacore.Ycolecoes.dominio.Consumidor;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMap01 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Matheus");
        Consumidor consumidor2 = new Consumidor("DevDojo Academy");
        NavigableMap<String, String> map = new TreeMap<>();
        map.put("A", "Letra A");
        map.put("D", "Letra D");
        map.put("E", "Letra E");
        map.put("C", "Letra C");
        map.put("B", "Letra B");

        for(Map.Entry<String, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }

        System.out.println(map.headMap("C",true));
        System.out.println(map.floorKey("C"));
        System.out.println(map.higherKey("C"));
        System.out.println(map.lowerKey("C"));
        System.out.println(map.ceilingKey("C"));
    }
}
