package javacore.Zgenerics.test;

import javacore.Zgenerics.dominio.BolsaNinja;

public class MainTest02 {
    public static void main(String[] args) {
        BolsaNinja<Object> bolsaNinja = new BolsaNinja<>();
        bolsaNinja.adicionarFerramenta("Kunai exeplosiva");
        bolsaNinja.adicionarFerramenta("Invocação sapo");
    }
}
