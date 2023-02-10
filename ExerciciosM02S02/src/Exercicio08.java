import java.util.Arrays;
import java.util.List;

public class Exercicio08 {

//    Localize na lista abaixo e imprima no console a primeira ocorrência de número maior que 50.
//
//    List<Integer> numeros = Arrays.asList(0,2,88,56,33,42,67,3,9,0,2);

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(0,2,88,56,33,42,67,3,9,0,2);

        // Feito por ForEach
        for (int i : numeros) {
            if (i > 50) {
                System.out.println(i);
                break;
            }
        }

        // Feito por While
        int contador = 0;
        while (contador < numeros.size()) {
            if (numeros.get(contador) > 50) {
                System.out.println(numeros.get(contador));
                break;
            }
            contador++;
        }

    }

}
