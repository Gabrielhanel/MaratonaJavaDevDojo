package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    private String tipo;
    private int episodios;
    private String nome;
    private String genero;
    private String estudio;

    public String getNome() {
        return nome;
    }

    public Anime(String tipo, int episodios, String nome, String genero) {
        this();
        this.tipo = tipo;
        this.episodios = episodios;
        this.nome = nome;
        this.genero = genero;
    }

    public Anime(String tipo, int episodios, String nome, String genero, String estudio) {
        this(tipo, episodios, nome, genero);
        this.estudio = estudio;
    }

    public Anime(){
        System.out.println("Dentro do construtor sem argumentos");
    }

    public void init(String nome, String tipo, int episodios) {
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }

    public void init(String nome, String tipo, int episodios, String genero) {
        this.init(nome, tipo, episodios);
        this.genero = genero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprimeAnime() {
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Episodios: " + this.episodios);
        System.out.println("Genero: " + this.genero);
        System.out.println("Nome: " + this.nome);
        System.out.println("Estudio: " + this.estudio);
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public String getTipo() {
        return tipo;
    }

    public int getEpisodios() {
        return episodios;
    }
}
