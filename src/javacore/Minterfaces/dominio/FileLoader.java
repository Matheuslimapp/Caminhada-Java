package javacore.Minterfaces.dominio;

public class FileLoader implements DateLoader{

    @Override
    public void load() {
        System.out.println("Carregando dados de um arquirvo");
    }
}
