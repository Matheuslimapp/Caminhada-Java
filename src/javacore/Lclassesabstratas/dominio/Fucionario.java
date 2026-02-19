package javacore.Lclassesabstratas.dominio;

public abstract class Fucionario extends Pessoa{
    protected String nome;
    protected double salario;

    public Fucionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calcularBonus();
    }

    @Override
    public void imprime() {
        System.out.println("Imprimindo...");
    }

    //So pode exister dentro de classes abstratas.
    //E não pode ter nenhum valor dentro dela
    public abstract void calcularBonus();
}
