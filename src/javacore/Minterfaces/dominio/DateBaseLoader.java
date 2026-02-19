package javacore.Minterfaces.dominio;

public class DateBaseLoader implements DateLoader, DateRemover {
    //Em interface a gente nao utiliza exentends e sim implements

    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do banco de dados");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões no banco de dados");
    }

    public static void retrieveMaxDatesize(){
        System.out.println("Dentro do retrieveMaxDatesize na classe DateSaseLoader");
    }
}