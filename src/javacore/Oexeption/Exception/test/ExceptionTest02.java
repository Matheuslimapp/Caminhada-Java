package javacore.Oexeption.Exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) throws IOException {
        criarNovoArquirvo();

    }
    public static void criarNovoArquirvo() throws IOException {
        File file = new File("arqurivo/test.txt");
        try{
            boolean isCriado = file.createNewFile();
            System.out.println("Arquirvo criado: "+ isCriado);
        }catch (IOException e){
            //NUNCA DEIXA EM BRANCOOOOO
            e.printStackTrace();
            throw e;
            //throw new RuntimeException("Problema na hora de criar o arquivo.");
        }
    }
}
