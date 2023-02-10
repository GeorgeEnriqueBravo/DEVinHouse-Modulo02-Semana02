import java.util.Arrays;
import java.util.List;

public class Exercicio07 {

//    Dado a lista de nomes:
//
//    List<String> nomes = Arrays.asList("kirk", "spock", "scott", "mccoy", "sulu");
//
//    a) Percorra a lista usando o operador 'for' clássico, usando uma variável para iterar pelos índices, e imprima no console os valores de cada nome;
//    b) Percorra a lista usando o operador 'for-each' usando a forma simplificada, e imprima no console os valores de cada nome;
//    c) Percorra a lista usando o operador 'while', e imprima no console os valores de cada nome;

    public static void main(String[] args) {

        List<String> nomes = Arrays.asList("kirk", "spock", "scott", "mccoy", "sulu");

        System.out.println("--- For Clássico ---");
        for (int i = 0; i < nomes.size(); i++) {
            String cadaNomeFor = nomes.get(i);
            System.out.println(cadaNomeFor);
        }

        System.out.println("--- ForEach ---");
        for (String i : nomes) {
            String cadaNomeForEach = i;
            System.out.println(cadaNomeForEach);
        }

        System.out.println("--- While ---");
        int contador = 0;
        while (contador < nomes.size()) {
            String cadaNomeWhile = nomes.get(contador);
            System.out.println(cadaNomeWhile);
            contador++;
        }
    }
}
