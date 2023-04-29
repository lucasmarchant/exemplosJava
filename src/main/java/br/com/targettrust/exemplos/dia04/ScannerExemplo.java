package br.com.targettrust.exemplos.dia04;

import java.util.Scanner;

public class ScannerExemplo {

    public static void main(String[] args) {

        System.out.println("Digite um número inteiro:");

        Scanner scanner = new Scanner(System.in);
        int numeroInteiro = scanner.nextInt();

        System.out.println("Valor digitado foi " + numeroInteiro);

        // Material extra sobre classe Scanner
        //   Java: Como ler dados do Console com a classe Scanner
        //   https://dicasdejava.com.br/java-como-ler-dados-do-console-com-a-classe-scanner/
    }
}
