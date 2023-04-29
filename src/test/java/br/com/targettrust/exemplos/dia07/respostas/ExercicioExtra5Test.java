package br.com.targettrust.exemplos.dia07.respostas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExercicioExtra5Test {

    @Test
    public void quandoReceberUmInteiroEntaoRetornarArray() {

        int valorInformado = 7;
        int primeiroValorEsperado = 6;
        int segundoValorEsperado = 7;
        int terceiroValorEsperado = 8;

        int[] valorRetornado = ExercicioExtra5.retornarValores(valorInformado);

        Assertions.assertEquals(primeiroValorEsperado, valorRetornado[0]);
        Assertions.assertEquals(segundoValorEsperado, valorRetornado[1]);
        Assertions.assertEquals(terceiroValorEsperado, valorRetornado[2]);
    }
}
