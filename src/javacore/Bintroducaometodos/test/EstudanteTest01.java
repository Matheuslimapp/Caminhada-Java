package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.dominio.Estudante;
import javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        ImpressoraEstudante impressoraEstudante = new ImpressoraEstudante();
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Midoriya";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        estudante02.nome = "Sakura";
        estudante02.idade = 16;
        estudante02.sexo = 'F';

        impressoraEstudante.imprime(estudante01);
        System.out.println("----------------------------");
        impressoraEstudante.imprime(estudante02);
        System.out.println("\n#####################\n");
        impressoraEstudante.imprime(estudante01);
        System.out.println("----------------------------");
        impressoraEstudante.imprime(estudante02);


    }
}
