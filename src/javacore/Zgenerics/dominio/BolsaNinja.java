package javacore.Zgenerics.dominio;

import java.util.ArrayList;
import java.util.List;

public class BolsaNinja<T>{

    //Inicializar nosso array
    private List<T> ferramentas;

    public BolsaNinja() {
        this.ferramentas = new ArrayList<>();
    }

    //Colocar ferramentas no nosso Array
    public void adicionarFerramenta(T ferramenta){
        ferramentas.add(ferramenta);
    }

    //Mostar listar ferramenta
    public void mostraFerramenta(){
        for (T ferramenta: ferramentas){
            System.out.println(ferramenta);
        }
    }
}
