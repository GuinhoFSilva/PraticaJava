import java.util.HashSet;
import java.util.Set;

public class ExercicioVinteETres {
    public static void main(String[] args) throws Exception {
        System.out.println(retornarProduto(12345));
        System.out.println(retornarProduto(112233));
        System.out.println(retornarProduto(-22)); // Se o número só conter digitos iguais, retorne um
    }
    static int retornarProduto(int numero){
        String numeroString = String.valueOf(Math.abs(numero));
        Set<Integer> setDigitos = new HashSet<>();
        for(int i = 0; i < numeroString.length(); i++){
            setDigitos.add(Integer.parseInt(String.valueOf(numeroString.charAt(i))));
        }
        
        if(setDigitos.size() == 1){
            return 1;
        }

        int produto = 1;
        for(int numAtual : setDigitos){
            produto *= numAtual;
        }
            return produto;
        
    }

}
