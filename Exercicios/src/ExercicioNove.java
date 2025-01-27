import java.util.Scanner;

public class ExercicioNove {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = scanner.nextInt();

        String resultado = verificarPrimo(numero);

        System.out.println(resultado);

        scanner.close();
    }
    public static String verificarPrimo(int numero){
        if (numero <= 1)
            return "O número " + numero + " não é primo";
        for (int i = 2; i <= Math.sqrt(numero); i++){
            if(numero % i == 0)
                return "O número " + numero + " não é primo";

        }
            return "O número " + numero + " é primo";
    }
}
