package javacore.Minterfaces.dominio;

public interface DateLoader {
    public static final int MAX_DATE_SIZE = 10;

    public abstract void load();

    default void checkPermission(){
        System.out.println("Fazendo checagem de permissões");
    }

    public static void retrieveMaxDatesize(){
        System.out.println("Dentro do retrieveMaxDatesize na interface");
    }
}
