package javacore.Oexeption.exception.test;

import javacore.Oexeption.exception.dominio.Funcionario;
import javacore.Oexeption.exception.dominio.LoginInvalidoException;
import javacore.Oexeption.exception.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }
}
