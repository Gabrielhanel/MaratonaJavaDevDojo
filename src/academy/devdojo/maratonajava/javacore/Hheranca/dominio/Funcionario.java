package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;

    /**
     * Primeiro chama o metodo imprime da classe Pessoa e após imprime o salario logo abaixo
     */
    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}