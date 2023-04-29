package br.com.targettrust.exemplos.dia07.enums;

import java.util.Scanner;

public class ExemploTiposPessoa {

    public static void main(String[] args) {

        // constante
        final String MENSAGEM_ERRO_LOGIN = "Ocorreu erro ao tentar efetuar login";

        // enum
        TipoPessoa tipoFisica = TipoPessoa.PESSOA_FISICA;
        TipoPessoa tipoJuridica = TipoPessoa.PESSOA_JURIDICA;

        // TipoPessoa.values() -> retorna todos valores do enum TipoPessoa
        for (TipoPessoa tipo : TipoPessoa.values()) {
            System.out.println(tipo);
        }

        System.out.println("Informe o tipo de conta: ");
        String entrada = new Scanner(System.in).nextLine();

        // TipoPessoa.valueOf -> converte o texto digitado no enum TipoPessoa
        TipoPessoa tipo = TipoPessoa.valueOf(entrada);

        // name() -> nome do enum
        System.out.println(tipo.name());

        // ordinal() -> posição do enum
        // 0 para PESSOA_FISICA e 1 PESSOA_JURIDICA
        System.out.println(tipo.ordinal());

        switch (tipo) {
            case PESSOA_FISICA:
                System.out.println("Pessoa física selecionada!");
                break;
            case PESSOA_JURIDICA:
                System.out.println("Pessoa jurídica selecionada!");
                break;
            default:
                System.out.println("Deu ruim");
        }

        if (tipo == TipoPessoa.PESSOA_JURIDICA) {
            System.out.println("A pessoa é jurídica");
        }
    }
}
