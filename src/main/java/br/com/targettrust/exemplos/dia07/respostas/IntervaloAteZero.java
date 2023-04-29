package br.com.targettrust.exemplos.dia07.respostas;

import java.util.Scanner;

/**
 Faça um método que pede um número ao usuário e retorna esse número.
 Faça outro método que recebe o número informado anteriormente e
 imprime cada número do intervalo dele até zero.
 Ex: se informado 3: 3 2 1 0
 */
public class IntervaloAteZero {

    public static void main(String[] args) {

        int numero = pedirNumero();
        imprimirNumeroAteZero(numero);
    }

    public static int pedirNumero() {
        System.out.println("Informe um número: ");
        return new Scanner(System.in).nextInt();
    }

    public static void imprimirNumeroAteZero(int numero) {
        while(numero >= 0) {
            System.out.print(numero + " ");
            //numero = numero - 1;
            numero--;
        }
    }
}