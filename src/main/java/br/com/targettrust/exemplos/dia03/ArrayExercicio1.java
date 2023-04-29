package br.com.targettrust.exemplos.dia03;

public class ArrayExercicio1 {

    public static void main(String[] args) {

        //Faça um método que recebe um array de inteiros e retorna o primeiro
        // elemento deste array. Se não houve, retornar -1.
        //int[] numeros = new int[0];

        /*int[] numeros = new int[3];
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;*/

        int[] numeros = new int[]{0, 20, 30};
        /*int valor = retornarPrimeiraPosicao(numeros);
        System.out.println(valor);*/

        int valor2 = retornarPrimeiraPosicaoV2(numeros);
        System.out.println(valor2);
    }


    static int retornarPrimeiraPosicao(int[] numeros) {
        if(numeros.length == 0) {
            return -1;
        } else {
            return numeros[0];
        }

    }
    static int retornarPrimeiraPosicaoV2(int[] numeros) {
        if(numeros[0] == 0) {
            return -1;
        } else {
            return numeros[0];
        }

    }



}
