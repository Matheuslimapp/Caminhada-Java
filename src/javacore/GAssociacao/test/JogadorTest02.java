package javacore.GAssociacao.test;

import javacore.GAssociacao.dominio.Jogador;
import javacore.GAssociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Matheus");
        Time time = new Time("Seleção Brasileira");

        jogador1.setTime(time);

        jogador1.imprime();
    }
}
