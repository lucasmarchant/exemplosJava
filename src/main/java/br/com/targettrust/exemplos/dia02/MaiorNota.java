package br.com.targettrust.exemplos.dia02;

public class MaiorNota {

    public static void main(String[] args) {
        float maiorNota1 = verificarMaiorNota(100, 100);
        System.out.println(maiorNota1);

        float maiorNota2 = verificarMaiorNota(85.6f, 50);
        System.out.println(maiorNota2);

        float maiorNota3 = verificarMaiorNota(50, 100);
        System.out.println(maiorNota3);

    }

    //Faça um método que recebe duas notas e retorna a maior entre elas.
    static float verificarMaiorNota(float notaGA, float notaGB) {
        float notaMaior;

        if(notaGA > notaGB) {
            notaMaior = notaGA;
        } else {
            notaMaior = notaGB;
        }

        return notaMaior;
    }
}
