package introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        int numero1 = 20;
        int numero2 = 10;
        double resultado = numero2/ (double)numero1;
        System.out.println(resultado);
        //System.out.println(numero1 - numero2);
        //System.out.println(numero1 + numero2);
        //System.out.println(numero1 * numero2);


        //%
        int resto = 20 % 2;
        System.out.println(resto);

        //<, >, <=, >=, ==, !=.
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualQueVinte = 10 == 20;
        boolean isDezIgualQueDez = 10 == 10;

        System.out.println("isDezMaiorQueVinte "+ isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte "+ isDezMenorQueVinte);
        System.out.println("isDezIgualQueVinte "+ isDezIgualQueVinte);
        System.out.println("isDezIgualQueDez "+ isDezIgualQueDez);
    }
}
