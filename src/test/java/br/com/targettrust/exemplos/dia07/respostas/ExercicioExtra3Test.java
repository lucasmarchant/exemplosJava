package br.com.targettrust.exemplos.dia07.respostas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExercicioExtra3Test {

    @Test
    public void quandoInformarIdadeMenorQue12EntaoRetornarCrianca() {

        int idade = 11;
        String valorEsperado = "Criança";

        String valorRetornado = ExercicioExtra3.verificarFaixaEtaria(idade);

        Assertions.assertEquals(valorEsperado, valorRetornado);
    }

    // Poderia criar um teste para cada valor OU parametrizar
    // No caso, estamos testando no mesmo @Test
    @Test
    public void quandoInformarIdadeEntre12e18EntaoRetornarAdolescente() {

        String valorEsperado = "Adolescente";

        int idade = 12;
        String valorRetornado = ExercicioExtra3.verificarFaixaEtaria(idade);
        Assertions.assertEquals(valorEsperado, valorRetornado);

        idade = 13;
        valorRetornado = ExercicioExtra3.verificarFaixaEtaria(idade);
        Assertions.assertEquals(valorEsperado, valorRetornado);

        idade = 17;
        valorRetornado = ExercicioExtra3.verificarFaixaEtaria(idade);
        Assertions.assertEquals(valorEsperado, valorRetornado);

        idade = 18;
        valorRetornado = ExercicioExtra3.verificarFaixaEtaria(idade);
        Assertions.assertEquals(valorEsperado, valorRetornado);
    }

    @Test
    public void quandoInformarIdadeMenorOuIgual18EntaoRetornarAdolescente() {

        int idade = 12;
        String valorEsperado = "Adolescente";
        String valorRetornado = ExercicioExtra3.verificarFaixaEtaria(idade);
        Assertions.assertEquals(valorEsperado, valorRetornado);

        idade = 13;
        valorEsperado = "Adolescente";
        valorRetornado = ExercicioExtra3.verificarFaixaEtaria(idade);
        Assertions.assertEquals(valorEsperado, valorRetornado);
    }

    @Test
    public void quandoInformarIdadeMaiorQue18EntaoRetornarAdulto() {

        String valorEsperado = "Adulto";

        int idade = 19;
        String valorRetornado = ExercicioExtra3.verificarFaixaEtaria(idade);
        Assertions.assertEquals(valorEsperado, valorRetornado);
    }

}
