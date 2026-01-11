package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.domain;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 250;

    public Carro(double velocidadeMaxima, String nome) {
        this.velocidadeMaxima = velocidadeMaxima;
        this.nome = nome;
    }

    public static double getVelocidadeLimite() {
        return velocidadeLimite;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public static void setVelocidadeLimite(double velocidadeLimite){
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprime(){
        System.out.println("____________________");
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade limite: " + Carro.velocidadeLimite);
        System.out.println("Velocidade maxima: " + this.velocidadeMaxima);
    }
}
