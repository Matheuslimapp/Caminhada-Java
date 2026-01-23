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


        // &&(and) ||(or) !(not)

        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario > 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario > 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta "+ isDentroDaLeiMaiorQueTrinta );
        System.out.println("isDentroDaLeiMenorQueTrinta "+ isDentroDaLeiMenorQueTrinta );

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        int valorPs5 = 5000;
        boolean isPlayStationCincoCompravel = valorTotalContaCorrente > valorPs5 || valorTotalContaPoupanca > valorPs5;
        System.out.println("isPlayStationCincoCompravel "+isPlayStationCincoCompravel);

        // =, -=, +=, *=, /=, %=
        double bonus = 1800;//1800
        bonus += 1000; // 2800
        bonus -= 1000; //1800
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        //++ --
        int contador = 0;
        contador += 1;
        contador ++;
        contador --;
        System.out.println(++contador);
    }
}
