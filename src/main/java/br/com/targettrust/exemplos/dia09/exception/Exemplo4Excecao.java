package br.com.targettrust.exemplos.dia09.exception;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Exemplo4Excecao {

    public static void main(String[] args) {

        //ArrayIndexOutOfBoundsException
        // NullPointerException extends RuntimeException
        //List<String> minhaLista = null;
        //minhaLista.size();

        // ArithmeticException extends RuntimeException
        /*int valor1 = 10;
        int valor2 = 0;
        if(valor2 == 0) {
            throw new IllegalArgumentException();
        }
        int i = 10 / 0;*/

        // InputMismatchException extends NoSuchElementException
        // se usuário digitar algo que não seja um inteiro
        Scanner scanner = new Scanner(System.in);
        int numeroDigitado = scanner.nextInt();

    }
}
