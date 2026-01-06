package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Eduardo";
        estudante01.idade = 18;
        estudante01.sexo = 'M';

        estudante02.nome = "Mariana";
        estudante02.idade = 20;
        estudante02.sexo = 'F';


        estudante02.imprime();
        estudante01.imprime();
    }
}
