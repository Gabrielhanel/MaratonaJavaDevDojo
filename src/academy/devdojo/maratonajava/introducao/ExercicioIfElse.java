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


        if (salario >= 0 && salario <= 38883) {
            double taxa = 35.7;
            taxa /= 100;
            double SalarioComTaxas = salario - (salario * taxa);
            System.out.println("Salario: " + SalarioComTaxas);

        } else if (salario >= 38884 && salario <= 77320) {
            double taxa = 37.56;
            taxa /= 100;
            double SalarioComTaxas = salario - (salario * taxa);
            System.out.println("Salario: " + SalarioComTaxas);

        } else {
            double taxa = 49.5;
            taxa /= 100;
            double SalarioComTaxas = salario - (salario * taxa);
            System.out.println("Salario: " + SalarioComTaxas);
        }
    }
}