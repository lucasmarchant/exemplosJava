package br.com.targettrust.exemplos.dia03;

public class Array {
    public static void main(String[] args) {
        int[] anos;
        anos = new int[3];
        anos[0] = 2020;
        anos[1] = 2021;
        System.out.println(anos.length);
        System.out.println(anos[0]);

        // segunda posicao -> 1987
        anos[1] = 1987;
        System.out.println(anos[0]);
        System.out.println(anos[1]);

        // primeira é 0
        // segunda é 1
        // terceira é 2
        anos[2] = 1996;
        System.out.println(anos);


    }
}
