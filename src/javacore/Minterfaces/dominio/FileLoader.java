package javacore.Minterfaces.dominio;

public class FileLoader implements DateLoader, DateRemover{

    @Override
    public void load() {
        System.out.println("Carregando dados de um arquirvo");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do arquirvo");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões no arquirvo");
    }
}
