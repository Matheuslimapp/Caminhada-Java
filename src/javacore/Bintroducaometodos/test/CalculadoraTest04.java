package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {34,4365,431,5645,657};
        calculadora.somaAray(numeros);
        calculadora.somaVarArgs(1,2);
    }
}
