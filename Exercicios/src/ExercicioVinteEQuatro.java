import java.util.HashSet;
import java.util.Set;


public class ExercicioVinteEQuatro {
    public static void main(String[] args) {
       System.out.println(separarDuplicatas("programacao e incrivel"));
       System.out.println(separarDuplicatas("Desafios sao otimos"));
       System.out.println(separarDuplicatas("letras duplicadas"));
    }
    static Set<String> separarDuplicatas(String texto){
        String textoFormatado = texto.toLowerCase();
        Set<String> letrasDuplicadas = new HashSet<>();
        for(int i = 0; i < textoFormatado.length() - 1; i++){
            char digitoAtual = textoFormatado.charAt(i);
            for(int j = i + 1; j < textoFormatado.length(); j++){
                char proximoDigito = textoFormatado.charAt(j);
                if(digitoAtual == proximoDigito && digitoAtual != ' '){
                    letrasDuplicadas.add(String.valueOf(proximoDigito));
                }
            }
        }
        return letrasDuplicadas;
    }
}
