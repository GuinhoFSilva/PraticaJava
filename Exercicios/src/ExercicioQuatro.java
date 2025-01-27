import java.util.Scanner;

public class ExercicioQuatro {

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int numeroUm = scanner.nextInt();

        System.out.println("Digite o segundo número:");
        int numeroDois = scanner.nextInt();

        System.out.println("Digite o terceiro número:");
        int numeroTres = scanner.nextInt();

        int resultado = operacao(numeroUm, numeroDois, numeroTres);

        System.out.println("A soma de " + numeroUm + " e " + numeroDois + " multiplicada por " + numeroTres + " é: " + resultado);

        scanner.close();
    }

    public static int operacao(int numeroUm, int numeroDois, int numeroTres){
        return (numeroUm + numeroDois) * numeroTres;


    }




}