package javacore.Fmodificadorstatio.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;
    static {
        System.out.println("Dentro do bloco de inicialização1 statico");
        episodios = new int[100];
        for (int i = 0; i < episodios.length;i++){
            episodios[i] = i+1;
        };
    }
    static {
        System.out.println("Dentro do bloco de inicialização2 statico");
    }

    static {
        System.out.println("Dentro do bloco de inicialização3 statico");
    }

    {
        System.out.println("Dentro do bloco de inicialização não estatico");
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodios : Anime.episodios){
            System.out.print(episodios + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }
}
