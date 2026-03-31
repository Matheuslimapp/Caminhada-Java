package javacore.Zgenerics.dominio;

public class EquipamentosNinja {
    private String nome;

    public EquipamentosNinja(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "EquipamentosNinja{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
