package javacore.Heranca.test;

import javacore.Heranca.dominio.Endereco;
import javacore.Heranca.dominio.Funcionario;
import javacore.Heranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("012345-209");
        Pessoa pessoa = new Pessoa("Deku");
        pessoa.setCpf("111111111");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Gojou");
        funcionario.setCpf("22222");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(1200);

        System.out.println("------------");
        funcionario.imprime();
    }
}
