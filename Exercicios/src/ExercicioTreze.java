import java.util.Scanner;
import java.util.InputMismatchException;

public class ExercicioTreze {
    public static void main (String [] args){
        try(Scanner scanner = new Scanner(System.in)){
            
            System.out.println("Informe o primeiro valor booleano:");
            boolean primeiroValor = scanner.nextBoolean();

            System.out.println("Informe o segundo valor booleano:");
            boolean segundoValor = scanner.nextBoolean();

            verificarBooleano(primeiroValor, segundoValor);
           
        } catch (InputMismatchException e){
            System.out.println("Erro! Informe um valor booleando entre 'true' ou 'false'");
        }
    }
    
    static void verificarBooleano (boolean primeiroValor, boolean segundoValor){
        if(primeiroValor && !segundoValor){
            System.out.println("O primeiro valor informado é verdadeiro");
        }else if (segundoValor && !primeiroValor){
            System.out.println("O segundo valor informado é verdadeiro");
        }else if (primeiroValor && segundoValor) {
            System.out.println("Ambos os valores são verdadeiros");
        }else{
            System.out.println("Ambos os valores são falsos");
        }
    }
}
