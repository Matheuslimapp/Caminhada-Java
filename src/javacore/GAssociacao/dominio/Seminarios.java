package javacore.GAssociacao.dominio;

public class Seminarios {
    private String titulo;
    private Estudante[] estudantes;
    private Local local;

    public Seminarios(String titulo, Estudante[] estudantes) {
        this.titulo = titulo;
        this.estudantes = estudantes;
    }

    public Seminarios(String titulo, Estudante[] estudantes, Local local) {
        this.titulo = titulo;
        this.estudantes = estudantes;
        this.local = local;
    }
    public void imprime(){
        System.out.println("Titulo: " + this.titulo);
        for (Estudante estudante : estudantes) {
            System.out.println("Aluno: "+ estudante.getNome() + " Idade: "+ estudante.getIdade());
        }
        if (local == null){ return;}
        System.out.println("Local: " + local.getEndereco());

    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Estudante[] getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(Estudante[] estudantes) {
        this.estudantes = estudantes;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
