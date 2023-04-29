package br.com.targettrust.exemplos.dia07.respostas;

/**
 * Faça um método que recebe uma lista de números inteiros e retorna o
 * primeiro número PAR.
 */
public class RetornaPrimeiroPar {

    public static void main(String[] args) {

        int[] inteiros = new int[]{1,3,5,7,4,9,8};

        int numero = obterPrimeiroPar(inteiros);
        System.out.println(numero);
    }

    public static int obterPrimeiroPar(int[] numeros) {
        int numeroPar = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (isPar(numeros[i])) {
                numeroPar  = numeros[i];
                break;
            }
        }

        return numeroPar;
    }


    /*public static int obterPrimeiroPar(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            int num = numeros[i];
            if (isPar(num)) {
                return num;
            }
        }

        return 0;
    }*/

    /*public static int obterPrimeiroPar(int[] numeros) {

        // foreach
        for (int num : numeros) {
            if (isPar(num)) {
                return num;
            }
        }


        return 0;
    }*/

    public static boolean isPar(int numero) {
        /*
        int resto = numero % 2;
        return resto == 0;
        */

        return numero % 2 == 0;
    }
}
