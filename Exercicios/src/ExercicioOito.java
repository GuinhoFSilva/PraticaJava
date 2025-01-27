import java.util.Scanner;

public class ExercicioOito {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número");
        int numero = scanner.nextInt();

        int resultado = valorAbsoluto(numero);

        System.out.println("O valor absoluto do número " + numero + " é " + resultado);

        scanner.close();
    }
    public static int valorAbsoluto (int numero){
        return Math.abs(numero);
    }
}
