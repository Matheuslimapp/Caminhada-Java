package javacore.Bintroducaometodos.dominio;

public class Calculadora {

    public void somaDoisNumeros(){
        System.out.println(10 + 13);
    }
    public void subtraiDoisNumeros(){
        System.out.println(21 - 2);
    }
    public void multiplicandoDoisNumeros(int num1, int num2){
        System.out.println("Mutiplicado: "+ (num1 + num2));
    }

    public double divideDoisNumeros(double num1, double num2){
        return num1/num2;
    }
}

