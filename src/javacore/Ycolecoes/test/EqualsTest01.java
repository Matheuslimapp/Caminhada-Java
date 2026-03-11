package javacore.Ycolecoes.test;

import javacore.Ycolecoes.dominio.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1", "Iphine");
        Smartphone s2 = new Smartphone("1ABC1", "Iphine");
        System.out.println(s1.equals(s2));

    }
}
