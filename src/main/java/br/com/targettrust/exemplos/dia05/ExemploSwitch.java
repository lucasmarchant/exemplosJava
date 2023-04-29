package br.com.targettrust.exemplos.dia05;

public class ExemploSwitch {

    public static void main(String[] args) {

        String operacaoFinanceira = "PIX";

        switch (operacaoFinanceira) {
            case "TED":
                System.out.println("Valor R$10,50");
                break;
            case "PIX":
                System.out.println("Valor R$0,00");
                break;
            case "BOLETO":
                System.out.println("Valor 1,60");
                break;
            default:
                System.out.println("Operação não definida");
        }
    }
}
