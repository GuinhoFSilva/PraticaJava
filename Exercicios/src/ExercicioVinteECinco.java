public class ExercicioVinteECinco {
    public static void main(String[] args) {
        System.out.println(somaImpares(123123));
        System.out.println(somaImpares(123456));
        System.out.println(somaImpares(13579));
    }
    static int somaImpares(int numero){
        String numeroString = String.valueOf(Math.abs(numero));
        int soma = 0;
        for(int i = 0; i < numeroString.length(); i++){
            int numAtual = numeroString.charAt(i) - '0';
            if(numAtual % 2 != 0){
                soma += numAtual;
            }
        }
        return soma;
    }
}
