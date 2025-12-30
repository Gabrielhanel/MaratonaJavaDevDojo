package academy.devdojo.maratonajava.introducao;

/* Calcule os impostos inclusos do salario da holanda:
	       Renda	| alíquota de imposto
Chave 1	| Até € 38.883 |	35,70%
Chave 2 | € 38.883 a € 77.320	| 37,56%
Grupo 3	| € 77.320	| 49,50%
*/
public class ExercicioIfElse {
    //psvma (public static void main(String[] args))
    public static void main(String[] args) {
        double salario = 80000;
        double taxa;
        if (salario >= 0 && salario <= 38883) {
            taxa = 35.7 / 100;

        } else if (salario >= 38884 && salario <= 77320) {
            taxa = 37.56 / 100;

        } else {
            taxa = 49.5 / 100;
        }
        double SalarioComTaxas = salario - (salario * taxa);
        System.out.println("Salario: " + SalarioComTaxas);
    }
}