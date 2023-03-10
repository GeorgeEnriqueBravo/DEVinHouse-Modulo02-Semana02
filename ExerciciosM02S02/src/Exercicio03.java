public class Exercicio03 {

    /*
    Percorra array com estrutura de repetição e faça operações com condicionais:

    O array abaixo representa lançamentos na conta bancária do Luke.
    Os valores negativos são débitos e os valores positivos são créditos.

    Implemente um código copiando o array abaixo, e depois imprima no console o que se pede:

    a) Percorra o array (operador 'for') e imprima cada elemento do array na ordem;
    b) Percorra o array (operador 'for') e imprima os elementos de trás pra frente (do último para o primeiro);
    c) Percorra o array (operador 'for') e calcule o saldo final da conta (valor inicial era zero),
    imprima o resultado no console. (Dica: crie uma variável saldo inicializada com zero e vá atualizando seu valor);
    d) Imprima no console a mensagem 'saldo positivo' ou 'saldo negativo', dependendo do resultado do saldo final calculado.
     */

    public static void main(String[] args) {

        int[] extrato = { 100, -35, -15, -5, 55, -20 };

//        for (int i = 0; i < extrato.length; i++) {
//            System.out.println(extrato[i]);
//        }

        // Esse codigo abaixo é igual ao de cima comentado, mas é feito como o forEach do JS
        System.out.println("Exercício letra A");
        for (int i : extrato) {
            System.out.println(i);
        }


        System.out.println("Exercício letra B");
        for (int i = extrato.length - 1; i >= 0 ; i--) {
            System.out.println(extrato[i]);
        }


        double total = 0;
        System.out.println("Exercício letra C");
        for (int i = 0; i < extrato.length; i++) {
            total = total + extrato[i];
        }
        System.out.println("Saldo final = " + total);


        System.out.println("Exercício letra D");
        if (total >= 0) {
            System.out.println("Saldo positivo");
        } else {
            System.out.println("Saldo Negativo");
        }

        // Outra forma de ser feita pelo professor
        // System.out.println("Saldo " + (total < 0 ? "negativo." : "positivo."));
    }

}
