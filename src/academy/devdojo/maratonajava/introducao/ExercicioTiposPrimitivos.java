package academy.devdojo.maratonajava.introducao;

import java.time.LocalDate;

public class ExercicioTiposPrimitivos {
    public static void main(String[] args){
        String nome = "Gabriel";
        String endereco = "Rua Do Comércio, 1950";
        Double salario = 2300.00;
        LocalDate dataAtual = LocalDate.now();

        System.out.println("Eu, " + nome +  ", morando no endereço, " +  endereco + " confirmo que recebi o salário de " + salario + " na data " + dataAtual);
    }
}
