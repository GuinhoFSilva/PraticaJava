import java.util.Scanner;
import java.util.InputMismatchException;

public class ExericioDezesseis {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            
            System.out.println("Informe a temperatura em graus fahrenheit");
            double fahrenheit = scanner.nextDouble();
            
            double celsius = (5.0/9) * (fahrenheit - 32);

            System.out.println("O valor de " + fahrenheit + " convertido para celsius fica: " + celsius); 
        
            
        } catch (InputMismatchException e){
            System.out.println("Informe um valor inteiro ou decimal");
        }
    }
}
