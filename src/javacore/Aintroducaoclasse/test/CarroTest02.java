package javacore.Aintroducaoclasse.test;

import javacore.Aintroducaoclasse.domino.Carro;

public class CarroTest02 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro1 = new Carro();

        carro.nome = "GT-R";
        carro.modelo = "Skyline";
        carro.ano = 2007;

        carro1.nome = "Fusca";
        carro1.modelo = "Volkswagen";
        carro1.ano = 1959;

        carro1 = carro;

        System.out.println("=========Menu De Carros=========");
        System.out.println("Nome: "+carro.nome+"\nModelo: "+carro.modelo+"\nAno: "+carro.ano+"\n");
        System.out.println("Nome: "+carro1.nome+"\nModelo: "+carro1.modelo+"\nAno: "+carro1.ano+"\n");

        }
}
