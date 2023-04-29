package br.com.targettrust.exemplos.dia05;

public class WhileExemplo {

    public static void main(String[] args) {

        int contador = 10;
        //10 9 8 ... 0

        //System.out.printf("%d/%s/%d", 10, "Marcia", 2017);
        while (contador >= 0) {

            int multiplicacao = contador * 7;

            // 7 x 0 = 0
            //System.out.print("7 x " + contador + " = " + multiplicacao);

            System.out.printf("7 x %d = %d \n", contador, multiplicacao);

            // Cuidado com looping infinito se nao colocar o incremento!
            //contador = contador + 1;
            //equivalente a fazer contador++;
            contador--;
            //contador = contador - 2;
        }


        // Métodos printf, print e println
        // http://www.bosontreinamentos.com.br/java/metodos-printf-print-e-println-curso-de-programacao-em-java/

    }
}
