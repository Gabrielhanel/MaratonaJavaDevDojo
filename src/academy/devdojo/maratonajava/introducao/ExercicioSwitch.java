package academy.devdojo.maratonajava.introducao;

public class ExercicioSwitch {
    // Utilizando switch e dados valores de 1 a 7 (sendo 1 o domingo), imprima se é dia util ou final de semana
    public static void main(String[] args) {
        byte DiasDaSemana = 7;

        switch (DiasDaSemana) {
            case 1:
                 System.out.println("Domingo, final de semana");
                 break;
            case 2:
                System.out.println("Segunda, dia útil");
                break;
            case 3:
                System.out.println("Terça, dia útil");
                break;
            case 4:
                System.out.println("Quarta, dia útil");
                break;
            case 5:
                System.out.println("Quinta, dia útil");
                break;
            case 6:
                System.out.println("Sexta, dia útil");
                break;
            case 7:
                System.out.println("Sábado, final de semana");
                break;
            default:
                System.out.println("Dia Inválido");
        }
    }
}
