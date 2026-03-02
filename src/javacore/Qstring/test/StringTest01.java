package javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Matheus"; // String constant pool
        String nome2 = "Matheus";
        nome = nome.concat(" Lima"); //mesma coisa de nome += "Suane"
        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 = new String("Matheus"); // 1 Variavel de referência, 2 objeto do tipo string, 3 uma string no pool de string
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
        //String são imutaveis CUIDADO!!
    }
}
