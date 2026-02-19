package javacore.Minterfaces.dominio;

public interface DateLoader {
    public abstract void load();

    default void checkPermission(){
        System.out.println("Fazendo checagem de permissões");
    }

}
