import java.util.Scanner;
import java.util.InputMismatchException;

public class ExercicioQuatorze {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){

            System.out.println("Informe o primeiro valor:");
            int primeiroValor = scanner.nextInt();
            
            System.out.println("Informe o segundo valor:");
            int segundoValor = scanner.nextInt();

            System.out.println("Informe o terceiro valor:");
            int terceiroValor = scanner.nextInt();

            int valores [] = {primeiroValor, segundoValor, terceiroValor};
                int maior = valores[0];
                int menor = valores[0];
                int meio = valores[0];
                for(int i = 0; i < valores.length; i++){

                if(valores[i] > maior){
                    maior = valores[i];
                }
                if(valores[i] < menor){
                    menor = valores[i];
                }

            }
            for(int i = 0; i < valores.length; i++){
                if(valores[i] > menor && valores[i] < maior){
                    meio = valores[i];
                }
            }
            int decrescente [] = {maior, meio, menor};

            for(int posicoes : decrescente){
                System.out.println(posicoes);

            }

        } catch (InputMismatchException e){
            System.err.println("Os valores informados devem ser números inteiros");
        }
    }
}
