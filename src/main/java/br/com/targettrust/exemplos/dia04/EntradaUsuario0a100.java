package br.com.targettrust.exemplos.dia04;

import java.util.Scanner;

public class EntradaUsuario0a100 {


    public static void main(String[] args) {
        int numero = pedirNumero();
        System.out.println(numero);
    }

    public static int pedirNumero() {
        int numero;
        boolean seNumeroEhValido;
        do {
            // faz algo
            System.out.println("Informe um número de 0 a 100: ");

            // Scanner(System.in).nextInt() -> chamou direto o nextInt()
            numero = new Scanner(System.in).nextInt();
            seNumeroEhValido = verificarIntervalo(numero);
        } while(seNumeroEhValido == false);
        //} while(!seNumeroEhValido);
        // !true -> false
        // !false -> true


        return numero;
    }

    static boolean verificarIntervalo(int numero) {
        if(numero >= 0 && numero <= 100) {
            return true;
        } else {
            return false;
        }
    }

}