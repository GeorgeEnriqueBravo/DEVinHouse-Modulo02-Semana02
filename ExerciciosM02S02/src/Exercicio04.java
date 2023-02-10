public class Exercicio04 {

    /*
    Mike tem um nro da sorte: 25.
    Ele conseguiu uma listagem do histórico dos resultados da loteria conforme arrays abaixo.
    Escreva um código para percorrer os elementos de nros sorteados e contabilizar quantas
    vezes o nro da sorte dele foi sorteado.
     */

    public static void main(String[] args) {

        int sorteados[][] = {
                { 1, 44,  6,  2, 45, 60},
                {10, 21, 55, 25, 34, 44},
                { 8, 18, 28, 29, 55, 59},
                {60, 25, 11, 34,  6,  9},
                {55, 43, 25, 12,  7, 11}
        };

        int total = 0;
        for (int i = 0; i < sorteados.length; i++) {
            for (int j = 0; j < sorteados[i].length; j++) {
                if (sorteados[i][j] == 25) {
                    total++;
                }
            }
        }
        System.out.println("O número da sorte dele foi sorteado " + total + " vezes");

        // Outra forma de ser feita por forEach
        int numeroDaSorte = 25;
        int numeroSorteado = 0;
        for (int[] arr : sorteados) {
            for (int number : arr) {
                if (number == numeroDaSorte)
                    numeroSorteado++;
            }
        }
        System.out.println(numeroSorteado);

    }

}
