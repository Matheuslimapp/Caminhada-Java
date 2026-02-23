package javacore.Oexeption.Exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
    criarNovoArquirvo();
    }

    private static void criarNovoArquirvo(){
        File file = new File("arqurivo/test.txt");
        try{
            boolean isCriado = file.createNewFile();
            System.out.println("Arquirvo criado: "+ isCriado);
        }catch (IOException e){
            //NUNCA DEIXA EM BRANCOOOOO
            e.printStackTrace();
        }
    }
}
