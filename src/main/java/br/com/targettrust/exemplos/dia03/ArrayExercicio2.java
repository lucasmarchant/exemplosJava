package br.com.targettrust.exemplos.dia03;

public class ArrayExercicio2 {

    //Faça um método que recebe um array de inteiros e retorna um array de
    //duas posições com o primeiro e o último elemento do array original.
    static int[] retornarArray(int[] numeros){
        int[] resultado = new int[2];
        resultado[0] = numeros[0];
        resultado[1] = numeros[numeros.length -1];
        return resultado;
    }

    public static void main(String[] args) {
        int[] arrayOriginal = new int[]{100, 200, 300, 400}; //4
        int[] novoArray = retornarArray(arrayOriginal);
        System.out.println(novoArray[0]);
        System.out.println(novoArray[1]);
    }


}
