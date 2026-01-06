package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    public void somaDoisNumeros(int numberA, int numberB){
        int soma = numberA + numberB;
        System.out.println(soma);
    }

    public void subtraiDoisNumeros(int numberA, int numberB){
        int soma = numberA - numberB;
        System.out.println(soma);
    }

    public double divideDoisNumeros(double num1, double num2){
        if (num2 == 0){
            return 0;
        }
        return num1 / num2;
    }
}
