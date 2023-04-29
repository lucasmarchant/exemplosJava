package br.com.targettrust.exemplos.dia07.respostas;

public class ExercicioExtra4 {

    // Ver classe de teste ExercicioExtra4Test.java
    /**
     Faça um método que recebe uma lista (array) com três valores, correspondentes a
     orçamentos de conserto de automóveis e retornar o menor valor entre eles.
     Exemplo: entrada: [45.0, 78.9, 10.1 ], retorno: 10.1
     */
    public static float retornarMenorOrcamento(float[] valores) {

        // inicializa com o primeiro valor do array
        float menorValor = valores[0];

        // A variável de controle começa com 1, ou seja, com a segunda posição do array
        // A primeira comparação será da primeira posição do array com a segunda
        // Depois da segunda com a terceira e assim por diante
        int i = 1;

        do {
            if(valores[i] < menorValor) {
                menorValor = valores[i];
            }
            i++;
        } while (i < valores.length);

        return menorValor;
    }

}
