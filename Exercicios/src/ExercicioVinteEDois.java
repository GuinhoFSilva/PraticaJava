import java.util.ArrayList;
import java.util.List;

public class ExercicioVinteEDois {
    public static void main(String[] args) {
        System.out.println(somar(200));
        System.out.println(somar(12134));
        System.out.println(somar(545346));
    }
    public static int somar(int numero){
        String numeroString = String.valueOf(numero);
        List<Integer> listaNumeros = new ArrayList<>();
        for(int i = 0; i < numeroString.length(); i++){
            int numAtual = Integer.parseInt(String.valueOf(numeroString.charAt(i)));
            if(!listaNumeros.contains(numAtual)){
                listaNumeros.add(numAtual);
            }
        }
        int somar = 0;
        for(int n : listaNumeros){
            somar += n;
        }
        return somar;
    }
}
