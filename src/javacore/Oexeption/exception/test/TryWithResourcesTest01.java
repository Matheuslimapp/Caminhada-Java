package javacore.Oexeption.exception.test;

import javacore.Oexeption.exception.dominio.Leitor1;
import javacore.Oexeption.exception.dominio.Leitor2;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
    lerArquivo();
    }

    public static void lerArquivo(){
        //Fechar na ordem inversa que criou
        try (Leitor1 leitor1= new Leitor1();
             Leitor2 leitor2 = new Leitor2()){

        }catch (IOException e){
        e.printStackTrace();
        }
    }
    //FEIO
    public static void lerArquivo2(){
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
