package br.com.targettrust.exemplos.dia06;

import java.util.Scanner;

public class ComparacaoStrings {

    public static void main(String[] args) {

        String statusPedidoRecebido = "concluido";
        String statusPedido = new Scanner(System.in).nextLine();

        /*if (statusPedido == "concluido") { // não é feito
            System.out.println("Pedido está concluído");
        } else {
            System.out.println("Pedido está em andamento");
        }*/

       /*if (statusPedido.equals("concluido")) {
            System.out.println("Pedido está concluído");
        } else {
           System.out.println("Nao caiu");
       }*/

       /*  if (statusPedido.equalsIgnoreCase(statusPedidoRecebido)) {
            System.out.println("Pedido está concluído");
        }*/

        if (statusPedido.compareTo("concluido") == 0) {
            System.out.println("Pedido está concluído");
        } else {
            System.out.println("Não é igual");
        }

       /* if (statusPedido.compareToIgnoreCase("CONCLUIDO") == 0) {
            System.out.println("Pedido está concluído");
        } else {
            System.out.println("Não é igual");
        }*/




    }
}
