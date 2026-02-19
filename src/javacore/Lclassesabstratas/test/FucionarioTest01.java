package javacore.Lclassesabstratas.test;

import javacore.Lclassesabstratas.dominio.Desenvolvedor;
import javacore.Lclassesabstratas.dominio.Fucionario;
import javacore.Lclassesabstratas.dominio.Gerente;

public class FucionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 10000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Deku", 12000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
    }
}
