import java.util.Scanner;

public class ExercicioTres {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");

        int numero = scanner.nextInt();

        String resultado = verificarSinal(numero);

        System.out.println(resultado);

        scanner.close();
    }

    public static String verificarSinal (int numero){
        if(numero < 0)
            return "Este número é negativo";
        else if(numero == 0)
            return "Este número é 0";
        else
            return "Este número é positivo";
    }
}
