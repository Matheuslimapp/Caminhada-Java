package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.dominio.Fucionario;

public class FucionarioTest01 {
    public static void main(String[] args) {
        Fucionario fucionario = new Fucionario();
        fucionario.setNome("Matheus");
        fucionario.setIdade(15);
        fucionario.setSalarios(new double[]{1324,5600,6000});
        fucionario.imprimir();
        fucionario.mediaSalario();
        System.out.println("Média: "+ fucionario.getMedia());
    }
}
