package academy.devdojo.maratonajava.introducao;

public class Foreach {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        int[] numeros2 = new int[]{1, 2, 3, 4, 5};

        for (int num: numeros2) {
            System.out.println(num);
        }
    }
}
