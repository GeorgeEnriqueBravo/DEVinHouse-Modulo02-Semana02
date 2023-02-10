import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//        Dado a lista de números:
//
//        List<Integer> lista = Arrays.asList(1,2,3,4);
//
//        Percorra a lista e gere uma nova com o triplo do valor de cada elemento:

public class Exercicio06 {

    public static void main(String[] args) {

        List<Integer> lista = Arrays.asList(1,2,3,4);
        List<Integer> novaLista = new ArrayList<>();


        for (int i = 0; i < lista.size(); i++) {
            novaLista.add(lista.get(i) * 3);
        }
        System.out.println(novaLista);

        // outra forma de ser feito
        List<Integer> novaLista2 = new ArrayList<>();

        lista.forEach(valor -> novaLista2.add(valor * 3));
        System.out.println(novaLista2);

        // outra forma de ser feito
        List<Integer> novaLista3 = lista.stream().map(valor -> valor * 3).collect(Collectors.toList());
        System.out.println(novaLista3);

    }

    // CTRL + D  que serve pra selecionar várias palavras iguais no VSCode
    // no IntelliJ é  ALT + J

}
