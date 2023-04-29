package br.com.targettrust.exemplos.dia07.respostas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExercicioExtra4Test {

    @Test
    public void quandoReceberArrayValoresEntaoRetornarMenorValor(){

        float[] valores = {45f, 78.9f, 10.1f};
        float resultadoEsperado = valores[2];

        float resultadoRetornado = ExercicioExtra4.retornarMenorOrcamento(valores);

        Assertions.assertEquals(resultadoEsperado, resultadoRetornado);

        // posso testar outras variações
        valores = new float[]{4, 78.9f, 10.1f};
        resultadoEsperado = valores[0];
        resultadoRetornado = ExercicioExtra4.retornarMenorOrcamento(valores);
        Assertions.assertEquals(resultadoEsperado, resultadoRetornado);

        valores = new float[]{49, 7.9f, 10.1f};
        resultadoEsperado = valores[1];
        resultadoRetornado = ExercicioExtra4.retornarMenorOrcamento(valores);
        Assertions.assertEquals(resultadoEsperado, resultadoRetornado);


    }
}
