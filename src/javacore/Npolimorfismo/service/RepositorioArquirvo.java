package javacore.Npolimorfismo.service;

import javacore.Npolimorfismo.repository.Repositorio;

    public class RepositorioArquirvo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em um arquivo");
    }
}
