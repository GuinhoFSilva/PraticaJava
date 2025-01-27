import java.util.Scanner;

public class ExercicioSeis {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = scanner.nextInt();

        String resultado = divisivelPorTres(numero);

        System.out.println(resultado);

        scanner.close();
    }
    public static String divisivelPorTres(int numero){
        if(numero % 3 == 0)
            return "Este número é divisível por 3";
        else
            return "Este número não é divisível por 3";
    
    }   
}
