import java.util.Scanner;
import java.util.InputMismatchException;

public class ExercicioQuinze{
    public static void main(String [] args){
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Informe o número que deseja tabular");
            int valor = scanner.nextInt();

            System.out.println("Informe até qual número o primeiro valor será tabulado");
            int limitador = scanner.nextInt();

            for(int i = 0; i <= limitador; i++){
                System.out.println(valor + " x " + i + " = " + (i * valor));
            }



        } catch (InputMismatchException e){
            System.out.println("Erro! Informe um número inteiro");
        }
    }
}