package br.com.targettrust.exemplos.dia07.respostas;

public class ExercicioExtra1 {

    // Veja classe de teste ExercicioExtra1Test.java
    /**
     * Faça um método que recebe um número inteiro e retorna textualmente se ele é zero, positivo ou negativo.
     * @param numero
     * @return
     */
    public static String verificarNumero(int numero) {
        if(numero < 0) {
            return "negativo";
        }

        if(numero > 0) {
            return "positivo";
        }

        return "zero";
    }
}
