package br.com.targettrust.exemplos.dia06;

import java.util.List;

public class PrimitivosVsWrappers {

    public static void main(String[] args) {

        //Primitivo
        int anoAtual = 2022;
        int num = Integer.parseInt("1234");

        //Wrapper
        Integer anoSeguinte = Integer.valueOf(2023);
        Integer proximoAnoSeguinte = Integer.valueOf("2024");
        //Integer numeroInteger = new Integer("1994");// - depreciado pois não é utilizado mais

        // Autoboxing e Unboxing
        Integer anoAnterior = 2021; // -> Autoboxing
        int outroAnoANterior = Integer.valueOf("2020"); // -> Unboxing

        Boolean ehNoite = Boolean.valueOf(true);
        Boolean ehDia = false;
        Boolean aTrue = Boolean.FALSE;

        String numero = "1.2";
        Float numeroFloat = Float.parseFloat(numero);

        // Métodos Static e Não Static

        // Métodos Static - [Classe].[metodo] = static
        int compare = Double.compare(1.2, 1.3);
        String letraASCII = Character.toString(65);
        String texto = String.format("Meu nome não é Jhony");

        // Métodos Não Static - [variavel].[metodo] = não static
        Double valor = 1.2;
        valor.compareTo(1.3);

        Integer ano = 2022;
        long convertidoParaLong = ano.longValue();

        String nome = "Jhony";
        nome.split("o");

        Integer numero2 = 123456;
        String numero2String = numero2.toString(); // Não Static
        String numero2StringOutraForma = String.valueOf(numero2); // Static
        System.out.println("numero2String " + numero2String);
        System.out.println("numero2StringOutraForma " + numero2StringOutraForma);
    }
}
