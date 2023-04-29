package br.com.targettrust.exemplos.dia07.respostas;

public class ExercicioExtra2 {

    // Veja classe de teste ExercicioExtra2Test.java
    /**
     * Faça um método que recebe um número inteiro correspondente à voltagem de uma casa e retorna textualmente
     * conforme as regras:
     *
     * Se a voltagem for igual a 110 retornar 1.
     * Se a voltagem for igual a 220 retornar 2.
     * Se a voltagem for menor que 110 retornar "baixa".
     * Se a voltagem for acima de 220 retornar "alta".
     * Se a voltagem estiver entre 110 e 220 retornar "indefinida".
     *
     * Exemplo: entrada: 115, retorno: "indefinida"
     */

    public static String verificarVoltagem(int voltagem) {
        // igual a 110 e 220 -> 0K
        // menor que 110 -> OK
        // maior que 220 -> OK
        // o que sobra? estar entre 110 e 220 -> indefinida -> é o último else
        if(voltagem == 110) {
            return "1";
        } else if (voltagem == 220) {
            return "2";
        } else if (voltagem < 110) {
            return "baixa";
        } else if (voltagem > 220) {
            return "alta";
        } else {
            return "indefinida";
        }
    }
}
