package javacore.Bintroducaometodos.dominio;

public class Fucionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double soma = 0;

    public void imprimir(){
        System.out.println("Nome: "+ this.nome);
        System.out.println("idade: "+ this.idade);
        for (double num: salarios)
        System.out.println("Salario: "+ num);
    }
    public void mediaSalario(){
        if (salarios == null){
            return;
        }
        for (double num: salarios){
            soma += num;
        }
        soma /= salarios.length;
        System.out.println("Média Salarial: "+ soma);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return soma;
    }
}
