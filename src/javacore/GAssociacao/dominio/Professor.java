package javacore.GAssociacao.dominio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminarios[] seminarios;


    public Professor(String nome) {
        this.nome = nome;
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminarios[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprime(){
        System.out.println("-----Professores-----");
        System.out.println(" Professor: "+ this.nome+"\n");
        if (seminarios == null){ return;}
            System.out.println("----Seminário cadastrados----");
            for (Seminarios seminario : seminarios) {
                seminario.imprime();
            }
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminarios[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminarios[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
