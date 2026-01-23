package introducao;

public class AulaEstrutrasCondicionais03 {
    public static void main(String[] args) {
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 reais para o DevDojo";
        String mensagemNaoDoar = "Ainda nao tenho condição, mas vou ter";
        //String resultado = (Condição) ? verdadeiro : falso;
        String resultado = (salario > 5000) ? mensagemDoar : mensagemNaoDoar;
        //boolean possoDoar = salario > 5000 ? true : false;
        System.out.println(resultado);

    }
}
