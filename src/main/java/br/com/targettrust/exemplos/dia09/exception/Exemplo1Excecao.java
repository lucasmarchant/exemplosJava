package br.com.targettrust.exemplos.dia09.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exemplo1Excecao {

    // Duas possibilidades:
    // (1) throws - chutar novamente
    // (2) tratar com try, catch
    public static void main(String[] args) {
        try {
            lerArquivo();
        } catch (FileNotFoundException e) {
            System.out.println("Deu ruim");
        }

    }

    // throws - indica que o método dispara uma exceção checada
    private static void lerArquivo() throws FileNotFoundException {

        System.out.println("Entrou no lerArquivo - exemplo 1");

        File arquivo = new File("notas.txt");
        FileReader fileReader = new FileReader(arquivo);
    }
}
