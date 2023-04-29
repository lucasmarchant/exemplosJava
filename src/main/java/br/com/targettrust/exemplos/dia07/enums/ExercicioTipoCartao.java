package br.com.targettrust.exemplos.dia07.enums;

import java.util.Scanner;

/*

Faça um programa que recebe como entrada a rendaMensal e retorna o tipo de cartão recomendado:

1. Crie um enum TipoCartao com as modalidades:
    - STANDARD
    - GOLD
    - PREMIUM
    - BLACK

2. Crie um novo método que devolve o tipo de cartão de uma financeira de acordo com a rendaMensal:

    STANDARD:   rendaMensal < 1000
    GOLD:       rendaMensal >= 1000 e < 3000
    PREMIUM:    rendaMensal >= 3000 e < 10000
    BLACK:      rendaMensal >= 10000

3. O main deve pedir a rendaMensal e imprimir o tipoDeCartao

*/
public class ExercicioTipoCartao {

    static final float VALOR_INICIAL_STANDARD = 1000;

    public static void main(String[] args) {

        System.out.println("Informe a renda mensal: ");
        float rendaMensal = new Scanner(System.in).nextFloat();
        TipoCartao tipoCartao = verificarCartaoDisponivel(rendaMensal);
        System.out.println(tipoCartao);

    }

   public static TipoCartao verificarCartaoDisponivel(float rendaMensal) {
        if(rendaMensal <= 0) {
            System.out.println("Valor inválido");
            return TipoCartao.INVALIDO;
        } else if(rendaMensal < VALOR_INICIAL_STANDARD) {
            return TipoCartao.STANDARD;
        } else if(rendaMensal >= 1000 && rendaMensal < 3000) {
            return TipoCartao.GOLD;
        } else if (rendaMensal>= 3000 && rendaMensal < 10000) {
            return TipoCartao.PREMIUM;
        } else {
            return TipoCartao.BLACK;
        }

    }
}