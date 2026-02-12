package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.dominio.Fucionario;

public class FucionarioTest01 {
    public static void main(String[] args) {
        Fucionario fucionario = new Fucionario();
        fucionario.nome = "Matheus";
        fucionario.idade = 15;
        fucionario.salarios = new double[]{1324,5600,6000};
        fucionario.imprimir();
        fucionario.mediaSalario();
    }
}
