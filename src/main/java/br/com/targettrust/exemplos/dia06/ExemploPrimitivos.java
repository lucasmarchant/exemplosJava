package br.com.targettrust.exemplos.dia06;

public class ExemploPrimitivos {

    public static void main(String[] args) {

        // pdf, video, imagem -
        // -128 a 127
        byte num = 127;
        byte pdf = 1;

        short num2 = 32767;

        int numeroEmpregados, idade, ano, mes, dia, valor;
        numeroEmpregados = 548_789_526;
        numeroEmpregados = 548789526;
        //System.out.println(numeroEmpregados);

        long numeroCelulasCorpo = 9223372036854775807L;

        // Maior do que long: BigInteger

        float valorCompra = 123.45F;

        double arrecadacaoMunicipal = 45874125953.25;

        // Para fazer cálculos monetários utilizamos o BigDecimal

        char caractere = '$';

        boolean verdadeiroOuFalso = true;
    }

}
