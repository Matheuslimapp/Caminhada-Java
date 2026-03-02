package javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "William Suane";
        nome.concat("DevDojo");
        nome.substring(0,3);
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("William Suane");
        sb.append(" DevDojo").append(" Academy");//Na StringBuilder so adiciona um valor com o append
        sb.reverse();//Inverte a ordem da String
        sb.reverse();
        sb.delete(0,3); //Deleta caractere
        System.out.println(sb);
    }
}
