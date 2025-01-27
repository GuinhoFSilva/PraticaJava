import java.util.Scanner;
import java.util.InputMismatchException;
public class ExercicioDoze {
    public static void main(String [] args){
        try (Scanner scanner = new Scanner(System.in);){

            double numero = scanner.nextDouble();
    
            double reajuste = 0.05 * numero;
    
            double resultado = numero + reajuste;
    
            System.out.println("O número " + numero + " com um reajuste de 5% fica: " + resultado);
            
        } catch (InputMismatchException e){
            System.out.println("Entrada inválida! Informe um valor numérico!");
        }
        
    }
}