package javacore.Uregex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    public static void main(String[] args) {
        // \d = Todos os dígitos
        // \D = Tudo que não for dígitos
        // \s = Todos Espaços em branco
        // \S = Todos os caracters excluindo os brancos
        // \w = Tudo de a-ZA-Z, dígitos, _
        // \W = Tudo que não for a-ZA-Z, dígitos, _
        // [] = Range
        // ? = Zero ou uma
        // * = 0 ou mais
        // + = uma ou mais
        // {n,m} de n ate m
        // () = pode acontecer varias vezes
        // | o(v|c)o = ovo ou oco
        // $ = final da linha
        // . 1.3 = 123,133, 1@3, 1A3 tudo que pode ter no meio do .
        String regex = "([\\w\\.-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";//matheus@gmail.com
        String texto = "luffy@hotmail.com, 123jotaro@gmail.com, #@(*zoro@email.br, test@gmail.com.br, sakura@mail";
        System.out.println("Email valido: ");
        System.out.println("zoro@email.br".matches(regex));
        System.out.println(texto.split(",")[1].trim());
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto:  "+ texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex:  "+ regex);
        System.out.println("Posicoes encontradas: ");
        while (matcher.find()){
            System.out.print(matcher.start()+" "+matcher.group()+ "\n");
        }
    }
}
