package br.com.targettrust.exemplos.dia07.respostas;

/**
 * Faça um método que recebe uma lista de notas e retorna a maior e a
 * menor entre elas
 */
public class MaiorEMenorNota {

    public static void main(String[] args) {

        // array com as notas
        float[] notas = {8, 4.5f, 7.5f};

        System.out.println("Maior nota foi: " + retornarMaiorNota(notas));
        System.out.println("Menor nota foi: " + retornarMenorNota(notas));
    }

    public static float retornarMaiorNota(float[] notas) {

        // inicializa com a primeira nota do array
        float maiorNota = notas[0];

        // A variável de controle começa com 1, ou seja, com a segunda posição do array
        // A primeira comparação será da primeira posição do array com a segunda
        // Depois da segunda com a terceira e assim por diante
        int i = 1;

        do {
            if(notas[i] > maiorNota) {
                maiorNota = notas[i];
            }
            i++;
        } while (i < notas.length);

        return maiorNota;
    }

    public static float retornarMenorNota(float[] notas) {

        // inicializa com a primeira nota do array
        float menorNota = notas[0];

        // A variável de controle começa com 1, ou seja, com a segunda posição do array
        // A primeira comparação será da primeira posição do array com a segunda
        // Depois da segunda com a terceira e assim por diante
        int i = 1;

        do {
            if(notas[i] < menorNota) {
                menorNota = notas[i];
            }
            i++;
        } while (i < notas.length);

        return menorNota;
    }
}
