package br.com.targettrust.exemplos.dia09.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exemplo3Excecao {

    public static void main(String[] args) {
        try {
            lerArquivo();
        } catch (ArquivoInformadoInvalidoException e ) {
            System.out.println("DEU RUIM " + e.getMessage());
        }

    }

    private static void lerArquivo() {

        System.out.println("Entrou no lerArquivo - exemplo 3");

        File arquivo = new File("notas.txt");
        try {

            FileReader fileReader = new FileReader(arquivo);

        } catch (FileNotFoundException e) {

            System.out.println("Arquivo não existe");

            // lançando exceção criada por nós
            throw new ArquivoInformadoInvalidoException("Informe um arquivo válido");
        }

    }
}
