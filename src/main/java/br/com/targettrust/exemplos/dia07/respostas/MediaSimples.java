package br.com.targettrust.exemplos.dia07.respostas;

/**
 * Faça um método que recebe uma lista de notas e retorna a média simples
 */
public class MediaSimples {

    public static void main(String[] args) {

        // array com três notas
        float[] notas = {10, 3.57f, 8.45f};

        // calcula a média simples
        float mediaSimples = calcularMediaSimples(notas);

        // formata com duas casas decimais
        System.out.printf("A média foi %.2f ", mediaSimples);
    }

    public static float calcularMediaSimples(float[] notas) {
        float somatorio = 0;

        // itera em todas as notas e soma cada uma
        // guarda o somatório na variável 'somatorio'
        for(float n : notas) {

            somatorio  = somatorio + n;
            // tudo isso:
            //   somatorio  = somatorio + n
            // é igual a fazer isso:
            //  somatorio += n;
        }

        // depois que tem todos os valores acumulados, divide pelo número de notas
        // notas.length -> é 3 (são 3 notas)
        float mediaSimples = somatorio / notas.length;

        return mediaSimples;
    }

}
