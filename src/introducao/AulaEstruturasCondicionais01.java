package introducao;

public class AulaEstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 20;
        boolean isAutorizadoComprarBebida = idade >= 18;
        //!
        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcólica");

        }else{
            System.out.println("Não Autorizado a comprar bebida alcólica");
            }

        /*if (!isAutorizadoComprarBebida){
            System.out.println("Não Autorizado a comprar bebida alcólica");
            }
         */


    }
}
