package javacore.Oexeption.exception.dominio;

import java.io.FileNotFoundException;

public class Funcionario extends Pessoa{
//Sobrescrevendo se quiser não precisa lançar nenhuma exception.
//Uma ou todas exception.
// Pode adicionar qualquer exception do tipo unChecked.
// Voce não pode adicionar exception generica.
    public void salvar() throws LoginInvalidoException, ArithmeticException {
        System.out.println("Salvando Funcionário");
    }
}
