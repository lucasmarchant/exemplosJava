package br.com.targettrust.exemplos.dia07.respostas;

/**
 Considerando as áreas de DDD do Sul:

 48 - Santa Catarina
 49 - Santa Catarina
 51 - Rio Grande do Sul
 53 - Rio Grande do Sul
 45 - Paraná
 46 - Paraná
 Outros - Estado não identificado

 Crie um método que recebe o código inteiro da área e retorna qual é o estado correspondente.
 */
public class ExemploEstados {

    public static void main(String[] args) {

        System.out.println(obterRegiao(47));

    }

    public static String obterRegiao(int ddd) {
        String regiao;
        switch(ddd){
            //case 48, 49: // Java 14
            case 48:
            case 49:
                regiao = "Santa Catarina";
                break;
            case 51:
            case 53:
                regiao = "Rio Grande do Sul";
                break;
            case 45:
            case 46:
                regiao = "Paraná";
                break;
            default:
                regiao = "Estado não identificada";
        }

        // Pode ser desenvolvido também com if, else if, else:
        /*if(ddd == 48 || ddd == 49) {
            regiao = "Santa Catarina";
        } else if(ddd == 51 || ddd == 53) {
            regiao = "Rio Grande do Sul";
        } else if(ddd == 45 || ddd == 46) {
            regiao = "Paraná";
        } else {
            regiao = "Estado não identificada";
        }*/

        return regiao;
    }

}
