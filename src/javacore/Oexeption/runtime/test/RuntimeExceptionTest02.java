package javacore.Oexeption.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        divisao(1,0);
        System.out.println("Codigo finalizado");
//        try {
//            divisao(1,0);
//        }catch (RuntimeException e){
//            e.printStackTrace();
//        }
    }
    private static int divisao(int a, int b){
        if (b == 0){
            throw  new IllegalArgumentException("Argumento ilegal, não pode ser 0");
        }
        return a/b;
    }
}
