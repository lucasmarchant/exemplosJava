package br.com.targettrust.exemplos.dia01;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;

public class CalculaAnos {

    public static void main(String[] args) {
        int diferenca = calcularDiferença(Calendar.getInstance().get(Calendar.YEAR), 1982);
        System.out.println(diferenca);

        mostrarAno();
    }

    static void mostrarAno() {
        Instant agora = Instant.now();
        ZonedDateTime dataHora = agora.atZone(ZoneId.systemDefault());
        int anoAtual = dataHora.getYear();
        System.out.println(anoAtual);
    }

    static int calcularDiferença(int anoFinal, int anoInicial) {
        // Faça um método que dois “anos” e calcula a diferença dentre eles.
        return anoFinal - anoInicial;
    }


}
