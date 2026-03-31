package javacore.Zgenerics.dominio;

import java.util.ArrayList;
import java.util.List;

public class BolsaGenerica<T>{
    //Toda classe generica tem que ter <> e o t(tipo) ou algum parametro ou outra letra
    private List<T> equipamentos;

    public BolsaGenerica() {
        this.equipamentos = new ArrayList<>();
    }

    //Colocar equipamento genericos
    public void adicionarEquipamentos(T equipamentoGenerico){
        equipamentos.add(equipamentoGenerico);
    }

    public List<T> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(List<T> equipamentos) {
        this.equipamentos = equipamentos;
    }

    @Override
    public String toString() {
        return "Bolsa de equipamentos: " + equipamentos.toString();
    }
}
