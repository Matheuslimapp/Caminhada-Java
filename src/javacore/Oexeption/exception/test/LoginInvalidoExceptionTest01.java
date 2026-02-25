package javacore.Oexeption.exception.test;

import javacore.Oexeption.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {

        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }

    }
    //Metodos com propria exception
    private static void logar() throws LoginInvalidoException{
        Scanner scanner = new Scanner(System.in);
        String usernameDB = "Goku";
        String senhaDB = "ssj";
        System.out.println("Usuario: \n");
        String usernameDigitado = scanner.nextLine();
        System.out.println("Senha: \n");
        String senhaDigitada = scanner.nextLine();
        if (!usernameDB.equals(usernameDigitado) || !senhaDB.equals(senhaDigitada)){
            throw new LoginInvalidoException("Usuario ou senha inválidos");
        }

        System.out.println("Usuário logado com sucesso ");

    }
}
