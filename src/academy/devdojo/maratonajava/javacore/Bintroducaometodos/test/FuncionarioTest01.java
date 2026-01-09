package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Carlos");
        funcionario.setIdade(45);
        funcionario.setSalarios(new double[]{5200.50, 1200, 2000});

        funcionario.imprime();
    }

}
