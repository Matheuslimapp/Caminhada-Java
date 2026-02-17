package javacore.GAssociacao.test;

import javacore.GAssociacao.dominio.Estudante;
import javacore.GAssociacao.dominio.Local;
import javacore.GAssociacao.dominio.Professor;
import javacore.GAssociacao.dominio.Seminarios;

public class AssociacaoTest01 {
    public static void main(String[] args) {
        Local local = new Local("Rua das laranjeiras");
        Estudante estudante = new Estudante("Luffy",17);
        Professor professor = new Professor("Barba Branca", "Pirata");
        Estudante[] estudantesParaSeminario = {estudante};

        Seminarios seminario = new Seminarios("Onde achar one piece", estudantesParaSeminario, local);

        Seminarios[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
