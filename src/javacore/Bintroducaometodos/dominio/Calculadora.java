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
        if(num2 == 0){
            return 0;
        }
        return num1/num2;
    }
    public double divideDoisNumeros02(double num1, double num2){
        if(num2 != 0) {
            return num1 / num2;
        }
        System.out.println("Não existe divisão por zero ");
        return 0;
    }
    public void imprimaDivisaoDeDoisNumeros(double num1, double num2){
        if (num2 == 0){
            System.out.println("Não existe divisão por zero ");
            return; //Break do Void
        }else {
        System.out.println(num1/num2);
    }
    }

    public void alteraDoisNumeros(int num1,int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do alterarDoisNumeros");
        System.out.println("Num1: "+num1);
        System.out.println("Num2: "+num2);
    }

    public void somaAray(int[] numeros){
        int soma = 0;
        for (int num: numeros){
            soma += num;
        }
        System.out.println("A soma do array é: "+ soma);
    }
    public void somaVarArgs(int... numeros){
        int soma = 0;
        for (int num: numeros){
            soma += num;
        }
        System.out.println("A soma do array é: "+ soma);
    }
}

