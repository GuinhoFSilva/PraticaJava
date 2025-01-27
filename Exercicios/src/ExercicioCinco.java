import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        
        int numero = scanner.nextInt();
        int resultado = quantidadeDigitos(numero);

        System.out.println("O número " + numero + " possui " + resultado + " dígito(s).");

        scanner.close();
    }
    public static int quantidadeDigitos (int numero){
            return String.valueOf(Math.abs(numero)).length();
    }
}
