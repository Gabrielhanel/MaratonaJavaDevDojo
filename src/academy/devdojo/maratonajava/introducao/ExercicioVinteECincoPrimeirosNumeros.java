package academy.devdojo.maratonajava.introducao;
//Dado um determinado valor, descubra os 25 primeiros numeros respectivos a ele
public class ExercicioVinteECincoPrimeirosNumeros {
    public static void main(String[] args) {

        int ValorMax = 50;
        for (int i = 0; i <= ValorMax; i++) {
            if (i > 25){
                break;
            }
            System.out.println(i);
        }
}}
