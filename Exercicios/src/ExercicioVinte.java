import java.util.ArrayList;
import java.util.List;

public class ExercicioVinte {
    public static void main(String[] args) {
        System.out.println(organizar("Uma frase incrível"));
        System.out.println(organizar("C B A"));
    }
    public static List<String> organizar(String frase){
        List<String> lista = new ArrayList<>();
        String [] palavras = frase.toLowerCase().split(" ");
        for(String palavra : palavras){
            lista.add(palavra);
        }

        return lista.stream().sorted().toList();
    }
}
