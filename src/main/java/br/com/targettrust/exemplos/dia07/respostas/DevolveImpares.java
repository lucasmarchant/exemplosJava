package br.com.targettrust.exemplos.dia07.respostas;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class DevolveImpares {

    public static void main(String[] args) {

        int[] inteiros = geradorLista(5);

        // Vai imprimir uma referência, um endereço de memória
        System.out.println("Array de números inteiros gerados randomicamente: " + inteiros);

        // Arrays.toString -> converte array em String
        System.out.println(Arrays.toString(inteiros));

        int[] impares = obterImpares(inteiros);

        for (int num : impares) {
            System.out.println(num);
        }
    }

    public static int[] obterImpares(int[] inteiros) {

        // quantos números ímpares tem nesse array de inteiros
        int quantidadeImpares = contarImpares(inteiros);

        // Cria um novo array de inteiros, dessa vez só com os ímpares
        // O tamanho deste array, será a qtde de ímpares encontrados no passo anterior
        int[] impares = new int[quantidadeImpares];

        int contatorImpares = 0;

        // itera no array de inteiros e para cada inteiro, verifica se é ímpar,
        // se for, insere no array de ímpares
        for (int i = 0; i < inteiros.length; i++) {
            if (isImpar(inteiros[i])){
                impares[contatorImpares++] = inteiros[i];
            }
        }

        return impares;
    }

    public static int contarImpares(int[] inteiros) {

        int contador = 0;

        // itera no array de inteiros e cada ímpar que encontrar, conta (incrementa o contador)
        for (int inteiro : inteiros) {
            if (isImpar(inteiro)) {
                contador++;
            }
        }

        // retorna quantos ímpares encontrou
        return contador;
    }

    public static boolean isImpar(int numero) {
        return numero % 2 != 0;
    }

    /**
     * Gera um array de inteiros randômicos
     * @param quantidade - quantos de números serão gerados
     * @return array de inteiros gerados randomicamente
     */
    public static int[] geradorLista(int quantidade) {

        Random gerador = new Random();

        // cria array de inteiros -> tamanho do array terá qtde de números randômicos
        // informados no argumento "quantidadade"
        int[] inteiros = new int[quantidade];

        // popular array de inteiros com números gerados randomicamente
        for (int i = 0; i < quantidade; i++) {
            inteiros[i] = gerador.nextInt(quantidade);
        }

        // retorna array de inteiros com números gerados randomicamente
        return inteiros;
    }
}
