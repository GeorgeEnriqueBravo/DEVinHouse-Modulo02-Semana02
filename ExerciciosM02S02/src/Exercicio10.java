import java.util.Scanner;

public class Exercicio10 {

//  Um palíndrome (ou palíndromo), segundo o dicionário Houaiss,
//  "diz-se de frase ou palavra que se pode ler, indiferentemente,
//  da esquerda para direita ou vice-versa", como por exemplo: osso, ana, radar.
//  Ou seja, é uma palavra que quando lida de trás pra frente tem o mesmo significado.
//
//  Implemente um código com o que aprendemos até agora que retorne se determinada palavra é um palíndromo.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra ou frase:");
        String palavra = scanner.nextLine();
        String palindromo = "";

        for (int i = palavra.length() - 1; i >= 0; i--) {
            palindromo += palavra.charAt(i);
            System.out.println(palavra.charAt(i));
        }

        if (palindromo.equals(palavra)) {
//            System.out.print("É um palíndromo!" + "\n" + palindromo);
            System.out.println("A palavra " + palindromo + " é um palíndromo.");
        } else {
//            System.out.print("Não é um palíndromo!" + "\n" + palindromo);
            System.out.println("A palavra " + palindromo + " não é um palíndromo.");
        }
//        scanner.close();

        // versao usando a classe StringBuilder passa pelo professor
        StringBuilder builder = new StringBuilder(palavra);
        String reverso = builder.reverse().toString();
        if (palavra.equals( reverso ))
            System.out.println("Eh palindrome!");
        else {
            System.out.println("Nao eh palindrome!");
        }

    }

}
