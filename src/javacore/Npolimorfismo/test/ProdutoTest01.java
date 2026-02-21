package javacore.Npolimorfismo.test;

import javacore.Npolimorfismo.dominio.Computador;
import javacore.Npolimorfismo.dominio.Televisao;
import javacore.Npolimorfismo.dominio.Tomate;
import javacore.Npolimorfismo.service.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
       Computador computador = new Computador("NUC10i7", 11000);
       Tomate tomate = new Tomate("Tomatão", 10);
        Televisao televisao = new Televisao("Samsung 50\" ", 50);
       CalculadoraImposto.calcularImposto(computador);
        System.out.println("-----------------------");
       CalculadoraImposto.calcularImposto(tomate);
       System.out.println("-----------------------");
        CalculadoraImposto.calcularImposto(televisao);
    }
}
