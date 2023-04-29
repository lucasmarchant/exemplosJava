package br.com.targettrust.exemplos.dia07.enums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExercicioTipoCartaoTest {

    //STANDARD:   rendaMensal < 1000
    @Test
    public void quandoRendaMensalForMenorQue1000EntaoRetornarCartaoStandard(){

        TipoCartao tipoCartao = ExercicioTipoCartao.verificarCartaoDisponivel(900);
        assertEquals(TipoCartao.STANDARD, tipoCartao);
    }

    // GOLD:       rendaMensal >= 1000 e < 3000
    @Test
    public void quandoRendaMensalForEntre1000EMenorQue3000EntaoRetornarCartaoGold(){
        TipoCartao tipoCartao = ExercicioTipoCartao.verificarCartaoDisponivel(1000);
        assertEquals(TipoCartao.GOLD, tipoCartao);

        TipoCartao tipoCartao2 = ExercicioTipoCartao.verificarCartaoDisponivel(1100);
        assertEquals(TipoCartao.GOLD, tipoCartao2);

        TipoCartao tipoCartao3 = ExercicioTipoCartao.verificarCartaoDisponivel(2999);
        assertEquals(TipoCartao.GOLD, tipoCartao3);
    }


}