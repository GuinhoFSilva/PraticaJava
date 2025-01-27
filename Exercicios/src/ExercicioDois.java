import java.util.Scanner;

public class ExercicioDois {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        
        int numero = scanner.nextInt();

        String resultado = verificarPar(numero);

        System.out.println(resultado);

        scanner.close();
    }

    public static String verificarPar (int numero){
        if(numero % 2 == 0)
            return "O número digitado é par";
        else
            return "O número digitado é impar";
    }
}
