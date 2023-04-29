package br.com.targettrust.exemplos.dia01;

public class Media {

    // Faça um método que recebe duas notas e calcula a média simples

    /**
     * Este método calcula a média simples
     * @param nota1  primeira nota da prova
     * @param nota2 segunda nota da prova
     * @return o valor da a média da prova
     * @autor Marcia
     */
    static double calcularMediaSimples(double nota1, double nota2) {
        System.out.println("Oi ");

        double media = (nota1 + nota2) / 2;

        // zero
        // maior que zero
        // validar antes
        if(media >= 0) {
            mostrarMensagem(media);
        }


        /*System.out.println("Nota1 " + nota1);
        System.out.println("Nota2 " + nota2);
        System.out.println("Somatório " + (nota1 + nota2));
        System.out.println("Média " + (nota1 + nota2) / 2);*/

        return media;

    }

    private static void mostrarMensagem(double media) {
        if(media >= 70) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado");
        }
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        double media = calcularMediaSimples(70, 50);
        System.out.println(media);

    }

}
