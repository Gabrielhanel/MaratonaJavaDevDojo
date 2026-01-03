package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarrosTest {
    public static void main(String[] args) {
        Carro golBolinha = new Carro();
        Carro unoMille = new Carro();

        golBolinha.model = "Volkswagen Gol G2";
        golBolinha.year = 1995;
        golBolinha.name = "Gol Bolinha";

        unoMille.model = "Fiat Uno Mille";
        unoMille.name = "Uno Mille";
        unoMille.year = 1990;

        System.out.println("Nome: " + golBolinha.model + " Ano: " + golBolinha.year + " Modelo: " + golBolinha.model);
        System.out.println("-----------------------------");
        System.out.println("Nome: " + unoMille.model + " Ano: " + unoMille.year + " Modelo: " + unoMille.model);
    }
}
