import java.util.Arrays;
import java.util.List;

public class ExercicioDezessete{
    public static void main(String[] args) {
        System.out.println(criptografar("criptografar"));

    }
    public static String criptografar(String texto){
        String novoTexto = texto.toLowerCase();
        String senha = "";
        List<String> alfabeto = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z");
            
            for(int i = 0; i < novoTexto.length(); i++){
                    String letraAtual = String.valueOf(novoTexto.charAt(i));
                    for(int j = 0; j < alfabeto.size(); j++){   
                        if(letraAtual.contains(alfabeto.get(j))){
                            int indice = alfabeto.indexOf(alfabeto.get(j)) + 1;
                            senha += indice; 
                        }
                    }
        }    
        return senha;
    }
}