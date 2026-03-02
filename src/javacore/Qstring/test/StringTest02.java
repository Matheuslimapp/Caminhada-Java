package javacore.Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "         LUffy   ";
        String numeros = "012345";
        System.out.println(nome.charAt(0));//Letra na String
        System.out.println(nome.length());//Tamanho String
        System.out.println(nome.replace("f", "l"));//Troca de letras na String
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(numeros.length());
        System.out.println(numeros.substring(3));
        System.out.println(numeros.substring(3,numeros.length()));//Pega de um determinado valor ate outro
        System.out.println(nome.trim());//Remove os valores em branco
    }
}
