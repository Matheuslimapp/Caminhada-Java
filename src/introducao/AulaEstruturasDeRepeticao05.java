package introducao;

public class AulaEstruturasDeRepeticao05 {
    //Dado um valor de um carro, descubra em quantas ele pode ser parcelado
    // Condição valorParcela>= 1800
    public static void main(String[] args) {
        int valorCarro = 40000;
        for (int parcela = valorCarro; parcela >= 1; parcela--) {
            int valorParcela = valorCarro / parcela;
            if (valorParcela < 1000){
                continue;

            }
                System.out.println("Parcela "+ parcela +"R$ "+valorParcela);
        }

    }
}