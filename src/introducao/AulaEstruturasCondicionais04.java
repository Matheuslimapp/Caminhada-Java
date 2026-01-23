package introducao;

public class AulaEstruturasCondicionais04 {
    public static void main(String[] args) {
        double salarioAnual = 3600;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorImposto;
        if (salarioAnual < 34713){
            valorImposto = primeiraFaixa * salarioAnual;
        }
        else if(salarioAnual >= 34713 && salarioAnual < 68507){
            valorImposto = segundaFaixa * salarioAnual;
        }
        else{
            valorImposto = terceiraFaixa * salarioAnual;
        }
        System.out.println("Valor do Imposto: "+ valorImposto);
    }
}
