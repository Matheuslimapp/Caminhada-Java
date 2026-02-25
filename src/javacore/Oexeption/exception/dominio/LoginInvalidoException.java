package javacore.Oexeption.exception.dominio;
//Extedendo classe exception você automaticamente diz que voce estar criando sua propria exception customizada
public class LoginInvalidoException extends Exception{
    public LoginInvalidoException() {
        super("Login invalido");
    }

    public LoginInvalidoException(String message) {
        super(message);
    }
}
