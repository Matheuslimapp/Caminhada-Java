package javacore.Bintroducaometodos.dominio;

public class Fucionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprimir(){
        System.out.println("Nome: "+ this.nome);
        System.out.println("idade: "+ this.idade);
        for (double num: salarios)
        System.out.println("Salario: "+ num);
    }
    public void mediaSalario(){
        double soma = 0;
        if (salarios == null){
            return;
        }
        for (double num: salarios){
            soma += num;
        }
        soma /= salarios.length;
        System.out.println("Média Salarial: "+ soma);
    }
}
