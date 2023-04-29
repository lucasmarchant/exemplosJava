package br.com.targettrust.exemplos.dia07.respostas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExercicioExtra2Test {

    @Test
    public void quandoReceberVoltagemIgual110EntaoRetornar1(){

        // asset
        int voltagem = 110;
        String valorEsperado = "1";

        // action
        String valorRetornado = ExercicioExtra2.verificarVoltagem(voltagem);

        // assertion
        Assertions.assertEquals(valorEsperado, valorRetornado);
    }

    @Test
    public void quandoReceberVoltagemIgual220EntaoRetornar2(){

        // asset
        int voltagem = 220;
        String valorEsperado = "2";

        // action
        String valorRetornado = ExercicioExtra2.verificarVoltagem(voltagem);

        // assertion
        Assertions.assertEquals(valorEsperado, valorRetornado);
    }

    @Test
    public void quandoReceberVoltagemMenorQue110EntaoRetornarBaixa(){

        // asset
        int voltagem = 109;
        String valorEsperado = "baixa";

        // action
        String valorRetornado = ExercicioExtra2.verificarVoltagem(voltagem);

        // assertion
        Assertions.assertEquals(valorEsperado, valorRetornado);
    }

    @Test
    public void quandoReceberVoltagemAcima220EntaoRetornarAlta(){

        // asset
        int voltagem = 221;
        String valorEsperado = "alta";

        // action
        String valorRetornado = ExercicioExtra2.verificarVoltagem(voltagem);

        // assertion
        Assertions.assertEquals(valorEsperado, valorRetornado);
    }

    @Test
    public void quandoReceberVoltagemEntre110e220EntaoRetornarIndefinida(){

        // asset
        int voltagem = 115;
        String valorEsperado = "indefinida";

        // action
        String valorRetornado = ExercicioExtra2.verificarVoltagem(voltagem);

        // assertion
        Assertions.assertEquals(valorEsperado, valorRetornado);
    }

}
