package br.com.targettrust.exemplos.dia09.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLDataException;

/*OBS: Este arquivo traz erros de compilação esperados, resolva o
        exercício para parar os erros!

Trate as exceções a seguir até o main() completar sem erros:*/

public class ExercicioPraticandoTryCatch {

    // Quais são as Exception e RuntimeException do Java?
    // Exception https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Exception.html
    // RuntimeException https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/RuntimeException.html


    //Não altere esse método main, altere somente dentro dos métodos que são chamados por ele
    public static void main(String args[]) {

        //excecoesNumericas();
        //nullPointerException();
       /* try {
            indexOfBounds();
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }*/

        //arquivoInexistente();
        /*try {
            erroDeConversao();
        } catch (NumberFormatException ex) {
            System.out.println("O valor informado é inválido " + ex.getMessage());
        }*/

       /* try {
            argumentoObrigatorio();
        } catch (IllegalArgumentException ex) {
            System.out.println("O valor informado é inválido");
        } catch (Exception ex) {
            System.out.println("Deu exception");
        }*/

        //multiplasExcecoes();
        multiplasExcecoesMultiCatch();

        System.out.println("Completou com sucesso! Parabéns!");
    }

    /*
    Tratar o erro usando um try/catch adequado. Não é necessário
    relançar, só logar (usar System.out.println)
    */
    private static void erroDeConversao() throws NumberFormatException {
        int num = 0;
        num = Integer.parseInt("zero");
    }

    /* Tratar o erro usando um try/catch adequado. Não é necessário
    relançar, só logar. */
    private static void arquivoInexistente() {

        //Estou apenas "definindo" qual arquivo vou abrir
        File file = new File("E://arquivo.txt");

        FileReader fr = null;
        try {
            fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo inexistente");
        } finally {

            try {
                if(fr != null) {
                    fr.close();
                }

            } catch (IOException e) {
                System.out.println("Ocorreu uma falha ao tentar fechar o arquivo");
            }

        }

    }

    /* A posição 29 não é um caracter válido. Tratar adequadamente */
    private static void indexOfBounds() {

        String e = "Imersao Java";
        char f;
        try {
            f = e.charAt(29);
            System.out.println(f);
        } catch (StringIndexOutOfBoundsException exception) {
            System.out.println("Posicao informada foi inválida");
            throw exception;
        }


    }

    /* Aqui ocorre nullpointer. o que fazer? */
    private static void nullPointerException() {
        String d = null;
        if(d != null) {
            System.out.println(d.charAt(0));
        } else {
            System.out.println("Informe um valor para a variável");
        }

    }

    /* Divisão por zero é outro caso. O que fazer? */
    private static void excecoesNumericas() {

        int a = 30, b = 0, c = 0;
        try{
            c = a / b;
            System.out.println ("Resultado = " + c);
        } catch (ArithmeticException e) {

            if(e.getMessage().contains("/ by zero"))  {
                System.out.println("Ocorreu divisão por zero que nao eh valida");
            }
           // System.out.println(e.getMessage());
        }


    }

    /* Esse método interno dispara uma exceção.
       Não queremos que ela suba até o main, o que podemos fazer para
       somente logar um erro? */
    private static void argumentoObrigatorio() throws IllegalArgumentException {
        metodoDisparaIllegal();
    }

    /* Esses 2 métodos internos disparam exceções.

    Não queremos que elas subam até o main, o que podemos fazer para
    somente logar erros?

    E se para cada uma das exceções que falhar, tivermos que
    escrever um log diferente? */
    private static void multiplasExcecoes() {

        //trate com vários catchs separados
        try {
            metodoDisparaSql();
        } catch (SQLDataException e) {
            System.out.println("Ocorreu um erro na execucao do sql");
        }
        try {
            metodoDisparaIOException();
        } catch (IOException e) {
            System.out.println("Erro de leitura e escrita");
        }
    }

    /* Esses 2 métodos internos disparam exceções.

    Não queremos que elas subam até o main, o que podemos fazer para
    somente logar erros?

    Neste caso queremos o mesmo log e tratamento para as duas
    exceções. Como fazemos?
    */
    private static void multiplasExcecoesMultiCatch() {

        //trate com apenas um multi-catch
        try {
            metodoDisparaSql();
            metodoDisparaIOException();
        } catch (Exception e) {
        System.out.println("Deu ruim, magraaaaão");
        }

    }

    /*
    A PARTIR DAQUI, NÃO ALTERE

    São só métodos úteis usados nos métodos de exercício.
    */
    private static void metodoDisparaIllegal() {

        int numero = 200;
        //Não altere esse método, somente quem o chama
        if(numero < 0) {
            throw new IllegalArgumentException();
        }

        if(numero > 100) {
            throw new RuntimeException();
        }



    }

    private static void metodoDisparaIOException() throws IOException {

        //Não altere esse método, somente quem o chama
        throw new IOException();
    }

    private static void metodoDisparaSql() throws SQLDataException {

        //Não altere esse método, somente quem o chama
        throw new SQLDataException();
    }
}