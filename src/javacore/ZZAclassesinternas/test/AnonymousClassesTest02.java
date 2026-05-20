package javacore.ZZAclassesinternas.test;

import javacore.Zgenerics.dominio.EquipamentosNinja;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
class EquipamentoNinjaComparator implements Comparator<EquipamentosNinja> {

    @Override
    public int compare(EquipamentosNinja o1, EquipamentosNinja o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}
public class AnonymousClassesTest02 {
    public static void main(String[] args) {
        List<EquipamentosNinja> equipamentosNinjasList =new ArrayList<>(List.of(new EquipamentosNinja("Shuriken"),new EquipamentosNinja("Estrela Ninja")));
        equipamentosNinjasList.sort((o1, o2) -> o1.getNome().compareTo(o2.getNome()));
        System.out.println(equipamentosNinjasList);
    }
}
