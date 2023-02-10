public class Exercicio05 {

    /*
    Implemente uma função 'calcular' que receba como parâmetro um array (numérico)
    e identifique o maior e menor valor do mesmo. Imprima no console estes valores
    ou "Não é possível calcular" qdo não for possível.

    Teste a função com as seguintes entradas:
     */
    public static void main(String[] args) {

        int[] array1 = {56, 65, 64, -3, 23, 42, -15, 65, 14, 32, 78, 70, 47};
        int[] array2 = {1};
        int[] array3 = {1, -1};
        int[] array4 = null;
        int[] array5 = {-2,-2,-2,-2};
        int[] array6 = {20,10, 30};

        calcular(array1);
        calcular(array2);
        calcular(array3);
        calcular(array4);
        calcular(array5);
        calcular(array6);
    }

    public static void calcular(int[] numero) { // esse numero é o parametro ou argumento recebido ao chamar a função

        if (numero != null && numero.length != 0) {
            int maior = numero[0];
            int menor = numero[0];
//             int maior = Integer.MIN_VALUE;
//             int menor = Integer.MAX_VALUE;

            for (int numeroDaVez : numero ) {
                if (maior < numeroDaVez) {
                    maior = numeroDaVez;
                }
                if (menor > numeroDaVez) {
                    menor = numeroDaVez;
                }
            }

            System.out.println("O maior número desse array é " + maior + " e o menor número é " + menor);
        } else {
            System.out.println("Não é possível localizar maior e menor de um array nulo");
        }

    }

}
