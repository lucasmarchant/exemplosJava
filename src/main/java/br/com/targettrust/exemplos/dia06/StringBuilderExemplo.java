package br.com.targettrust.exemplos.dia06;

public class StringBuilderExemplo {

    public static void main(String[] args) {
        /*// String é imutável
        String texto = "abc";
        String texto3 = "cde";
        texto.concat(texto3);
        System.out.println(texto);

        // StringBuilder é mutável
        StringBuilder texto2 = new StringBuilder("oi ");
        texto2.append("mundo");
        System.out.println(texto2);*/

        int[] pedidos = new int[]{45658, 124, 784526};

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Pedidos gerados: \n");

        for (int i = 0; i < pedidos.length; i++) {
            stringBuilder.append(pedidos[i]).append(" ");
        }

        System.out.println(stringBuilder);

    }
}
