import java.util.ArrayList;
import java.util.List;

public class ExercicioDezoito{
    public static void main(String[] args) throws Exception {
        //Lista Ordenada
        System.out.println(ordenar(24245609));
        System.out.println(ordenar(54321));
    }
    public static List<Integer> ordenar(int numero){

        String numerosString = String.valueOf(numero);

        List<Integer> lista = new ArrayList<>();
        for(int i = 0; i < numerosString.length(); i++){
            String numAtual = String.valueOf(numerosString.charAt(i));
            lista.add(Integer.parseInt(numAtual));
        }
        List<Integer> novaLista = lista.stream().sorted().toList();
        return novaLista;
    }
}