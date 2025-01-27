import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ExercicioDezenove{
    public static void main(String[] args) {
        System.out.println(ordernar(123123));
        System.out.println(ordernar(7497546));
    }
    public static List<Integer> ordernar(int numero){
        String numeroString = String.valueOf(numero);
        List<Integer> listaNumero = new ArrayList<>();
        for(int i = 0; i < numeroString.length(); i++){
            listaNumero.add(Integer.parseInt(String.valueOf(numeroString.charAt(i))));
        }
        return listaNumero.stream().sorted(Comparator.reverseOrder()).toList();
    }
}
