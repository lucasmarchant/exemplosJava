package br.com.targettrust.exemplos.dia02;

public class Par {

    public static void main(String[] args) {
        boolean ehPar = verificarPar(5);
        System.out.println(ehPar);
    }

    // Faça um método que verifica se um número é par.
    // Se par, retornar "true", senão, "false".
    static boolean verificarPar(int numero) {
        int resto = numero % 2;
        /*if(resto == 0) {
            return true;
        } else {
            return false;
        }*/

        /*if(resto == 0) {
            return true;
        }
        return false;*/

        return resto == 0;
    }

}
