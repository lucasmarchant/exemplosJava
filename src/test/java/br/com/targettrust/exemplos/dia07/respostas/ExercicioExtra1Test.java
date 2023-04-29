package br.com.targettrust.exemplos.dia07.respostas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExercicioExtra1Test {

    @Test
    public void quandoReceberValorZeradoEntaoRetornarTextoZero() {

        // asset
        int numero = 0;
        String resultadoEsperado = "zero";

        // action
        String resultadoRetornado = ExercicioExtra1.verificarNumero(numero);

        // assertion
        Assertions.assertEquals(resultadoEsperado, resultadoRetornado);
    }

    @Test
    public void quandoReceberValorMaiorQueZeroEntaoRetornarTextoPositivo() {

        // asset
        int numero = 1;
        String resultadoEsperado = "positivo";

        // action
        String resultadoRetornado = ExercicioExtra1.verificarNumero(numero);

        // assertion
        Assertions.assertEquals(resultadoEsperado, resultadoRetornado);
    }

    @Test
    public void quandoReceberValorMenorQueZeroEntaoRetornarTextoNegativo() {

        // asset
        int numero = -1;
        String resultadoEsperado = "negativo";

        // action
        String resultadoRetornado = ExercicioExtra1.verificarNumero(numero);

        // assertion
        Assertions.assertEquals(resultadoEsperado, resultadoRetornado);
    }

}
