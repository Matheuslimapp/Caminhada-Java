package javacore.Zgenerics.test;


import javacore.Zgenerics.dominio.BolsaGenerica;
import javacore.Zgenerics.dominio.EquipamentosNinja;

public class MainTest01 {
    public static void main(String[] args) {
        EquipamentosNinja kunai =new EquipamentosNinja("Kunai de ferro");
        EquipamentosNinja shuriken =new EquipamentosNinja("shuriken");
        EquipamentosNinja pergaminho =new EquipamentosNinja("Pergaminho");

        BolsaGenerica<EquipamentosNinja> bolsaGenerica = new BolsaGenerica<>();
        bolsaGenerica.adicionarEquipamentos(kunai);
        bolsaGenerica.adicionarEquipamentos(shuriken);
        bolsaGenerica.adicionarEquipamentos(pergaminho);

        System.out.println(bolsaGenerica);
    }
}
