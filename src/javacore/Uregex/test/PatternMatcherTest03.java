package javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        // \d = Todos os dígitos
        // \D = Tudo que não for dígitos
        // \s = Todos Espaços em branco
        // \S = Todos os caracters excluindo os brancos
        // \w = Tudo de a-ZA-Z, dígitos, _
        // \W = Tudo que não for a-ZA-Z, dígitos, _
        // [] =
        String regex = "0[xX][0-9a-fA-F]";
        //String texto = "abaaba";
        String texto2 = "12 0x 0X 0xFFABC 0x109 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texto:  "+ texto2);
        System.out.println("indice: 0123456789");
        System.out.println("regex:  "+ regex);
        System.out.println("Posicoes encontradas: ");
        while (matcher.find()){
            System.out.print(matcher.start()+" "+matcher.group()+ "\n");
        }
    }
}
