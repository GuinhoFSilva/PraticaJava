import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ExercicioVinteEUm {
    public static void main(String[] args) {
        System.out.println(conferirDigitosRepetidos(123321));
        System.out.println(conferirDigitosRepetidos(12233));
    }
    public static Set<Integer> conferirDigitosRepetidos(int numero){
        String numeroString = String.valueOf(numero);
        List<Integer> listaNumeros = new ArrayList<>();
        for(int i = 0; i < numeroString.length(); i++){
            listaNumeros.add(Integer.parseInt(String.valueOf(numeroString.charAt(i))));
        }
        Set<Integer> numerosDuplicados = new HashSet<>();
        for(int i = 0; i < listaNumeros.size() - 1; i++){
            for(int j = i + 1; j < listaNumeros.size(); j++){
                if(listaNumeros.get(i).equals(listaNumeros.get(j))){
                    numerosDuplicados.add(listaNumeros.get(i));
                }
            }
        }
        return numerosDuplicados;
    }
}
