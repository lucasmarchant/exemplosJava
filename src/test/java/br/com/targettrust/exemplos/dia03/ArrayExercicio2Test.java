package br.com.targettrust.exemplos.dia03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayExercicio2Test {

    @Test
    void devolverNovoArray() {

        // assets
        //variáveis necessárias
        int[] arrayOriginal = new int[]{100, 200, 300, 400};
        int valorInicialEsperado = 100;
        int valorFinalEsperado = 400;

        // action
        //chamada
        int[] novoArray = ArrayExercicio2.retornarArray(arrayOriginal);

        // asserções
        Assertions.assertEquals(valorInicialEsperado, novoArray[0]);
        Assertions.assertEquals(valorFinalEsperado, novoArray[1]);

    }

}
