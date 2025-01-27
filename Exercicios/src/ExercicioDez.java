import java.util.InputMismatchException;
import java.util.Scanner;

public class ExercicioDez {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        try{

            System.out.println("Informe o primeiro número");
            int a = scanner.nextInt();
            
            System.out.println("Informe o segundo número");
            int b = scanner.nextInt();
            int c;
            
            if(a == b){
                c = somar(a, b);
            }else{
                c = multiplicar(a, b);
            }
            
            System.out.println("Resultado: " + c);
            
            
        } catch (InputMismatchException e){
            System.out.println("Entrada inválida! Informe um número inteiro!");
        }
            scanner.close();
    }
    static int somar(int a, int b){
        return a + b;
    }
    static int multiplicar(int a, int b){
        return a * b;
    }
}
