package br.com.targettrust.exemplos.dia07.respostas;

public class TiposDados {

    // Unboxing/Autoboxing
    // ● Autoboxing é a propriedade que faz auto conversão de primitivo em Wrapper.
    // ● Unboxing ocorre quando uma Classe Wrapper é convertida para seu primitivo.
    public static void main(String[] args) {

        int idadePrimitivo = 23;
        Integer idadeWrapper = 23;
        idadeWrapper = Integer.valueOf(20);

        int anoNascimentoPrimitivo = 1990;
        Integer anoNascimentoWrapper = Integer.valueOf("1987");

        boolean isBissextoPrimitivo = false;
        Boolean isBissextoWrapper = Boolean.TRUE;

        char primeiraLetraNomePrimitivo = 'M';
        Character primeiraLetraNomeWrapper = 'M';

        String bandeiraCartao = "MASTER";

        float precoDolarPrimitivo = 5.06f;
        Float precoDolarWrapper = precoDolarPrimitivo;
        Float precoDolarWrapper2 = Float.valueOf(5.06f);

        // população do Brasil (209,3 milhões)
        int populacaoBrasil = 209_300_000;

        // População brasileira chega a 213,3 milhões de habitantes, estima IBGE
        // https://www.gov.br/pt-br/noticias/financas-impostos-e-gestao-publica/2021/08/populacao-brasileira-chega-a-213-3-milhoes-de-habitantes-estima-ibge
        populacaoBrasil = 213_300_000;
        System.out.println(populacaoBrasil);

        // população mundial (7,7 bilhões)
        long populacaoMundial = 7_700_000_000L;
        System.out.println(populacaoMundial);

        System.out.println("Menor valor do inteiro " + Integer.MIN_VALUE);
        System.out.println("Maior valor do inteiro " + Integer.MAX_VALUE);

        System.out.println("Menor valor do long " + Long.MIN_VALUE);
        System.out.println("Maior valor do long " + Long.MAX_VALUE);

        final double PI = 3.141592653589793;
        System.out.println("Minha constante PI " + PI);
        System.out.println("O Java tem uma constante PI " + Math.PI);

    }
}
