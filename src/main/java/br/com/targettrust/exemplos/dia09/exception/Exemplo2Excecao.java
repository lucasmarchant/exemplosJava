package br.com.targettrust.exemplos.dia09.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exemplo2Excecao {

    public static void main(String[] args) {
        lerArquivo();
    }

    // Podemos:
    // (1) try catch + throw new
    //   -> throw dispara uma exceção Checked OU Unchecked
    //   -> Exemplo IOException OU RuntimeException
    // (2) try catch + tratar
    // (3) throws -> do exemplo anterior
    private static void lerArquivo() {

        System.out.println("Entrou no lerArquivo - exemplo 2");

        File arquivo = new File("notas.txt");
        try {
            FileReader fileReader = new FileReader(arquivo);
        } catch (FileNotFoundException e) {
            //throw new RuntimeException(e);

            System.out.println("Deu ruim de novo");
        }

    }
}
