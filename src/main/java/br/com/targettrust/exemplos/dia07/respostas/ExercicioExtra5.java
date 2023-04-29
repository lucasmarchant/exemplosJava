package br.com.targettrust.exemplos.dia07.respostas;

public class ExercicioExtra5 {

    // Ver classe de teste ExercicioExtra5Test.java
    /**
     Faça um método que recebe um número inteiro qualquer e retorna uma lista (array)
     com três valores, sendo estes respectivamente:

     ○ o número anterior ao número informado
     ○ o próprio número informado
     ○ o próximo número ao número informado.

     Exemplo: entrada: 7, retorno: [6, 7, 8]

     */
    public static int[] retornarValores(int numero) {

        // array com o número anterior, o número informado e o
        // valor posterior
        int[] valores = new int[3];

        // o número anterior ao informado (é o número MENOS 1)
        valores[0] = numero - 1;

        // o número informado
        valores[1] = numero;

        // o número posterior ao informado (é o número MAIS 1)
        valores[2] = numero + 1;

        return valores;
    }
}
