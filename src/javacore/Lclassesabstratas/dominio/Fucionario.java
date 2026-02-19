package javacore.Lclassesabstratas.dominio;

public abstract class Fucionario {
    protected String nome;
    protected double salario;

    public Fucionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calcularBonus();
    }
    //So pode exister dentro de classes abstratas.
    public abstract void calcularBonus();
}
