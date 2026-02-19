package javacore.Minterfaces.dominio;

public class DateBaseLoader implements DateLoader{
    //Em interface a gente nao utiliza exentends e sim implements

    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }
}
