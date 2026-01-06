package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {

    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Eduardo";
        estudante01.idade = 18;
        estudante01.sexo = 'M';

        estudante02.nome = "Mariana";
        estudante02.idade = 20;
        estudante02.sexo = 'F';

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);

        System.out.println(estudante01.sexo);
        System.out.println(estudante01.idade);
        System.out.println(estudante01.nome);

        System.out.println("___________________");

        System.out.println(estudante02.sexo);
        System.out.println(estudante02.idade);
        System.out.println(estudante02.nome);
     }
}
