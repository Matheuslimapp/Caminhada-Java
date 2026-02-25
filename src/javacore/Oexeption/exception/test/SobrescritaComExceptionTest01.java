package javacore.Oexeption.exception.test;

import javacore.Oexeption.exception.dominio.Funcionario;
import javacore.Oexeption.exception.dominio.Pessoa;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        funcionario.salvar();
    }
}
