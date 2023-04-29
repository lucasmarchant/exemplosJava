package br.com.targettrust.exemplos.dia06;

public class ExemploWrappers {

    public static void main(String[] args) {

        Byte num = 127;

        Byte[] pdf;
        Byte[] video;
        Byte[] imagem;

        Short num2 = 32767;

        Integer numeroEmpregados, a, b, c, d, e;
        numeroEmpregados = 1_548_789_526;
        numeroEmpregados = 1548789526;

        Long numeroCelulasCorpo = 9223372036854775807L;

        // Maior do que long: BigInteger

        Float valorCompra = 123.45F;

        Double arrecadacaoMunicipal = 45874125953.25;

        // Para fazer cálculos monetários utilizamos o BigDecimal

        Character caractere = '$';

        // true / false / null
        Boolean verdadeiroOuFalso = true;
    }
}
