import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Locale;

public class ExercicioOnze {
    public static void main (String [] args){
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US);){
            double salarioMinimo = 1293.20; 

            System.out.println("Informe seu salário:");
            double salarioUsuario = scanner.nextDouble();

            double resultado = salarioUsuario / salarioMinimo;

            System.out.println("Você ganha aproximadamente: " + resultado + " salário(s) mínimos!");
            

        } catch (InputMismatchException e){
            System.out.println("Erro de entrada! O salário deve ser um valor numérico!!");
        }


    }
}
