package javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
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
        // ()
        // | o(v|c)o = ovo ou oco
        // $ = final da linha
        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String texto = "12 0x 0X 0xFFABC 0x10G 0x1";
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
