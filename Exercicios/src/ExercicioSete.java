import java.util.Scanner;

public class ExercicioSete {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase:");
        String frase = scanner.nextLine();

        int resultado = contarVogais(frase);

        System.out.println("A frase " + frase + " possui " + resultado + " vogais");

        scanner.close();
    }
    public static int contarVogais (String frase){
        frase = frase.toLowerCase();
        int contador = 0;
        for(int i = 0; i < frase.length(); i++){
            char caracterAtual = frase.charAt(i);
            if(caracterAtual == 'a' || caracterAtual == 'e' || caracterAtual == 'i' || caracterAtual == 'o' || caracterAtual == 'u')
                contador++;
        }
        return contador;
            
    }
}
