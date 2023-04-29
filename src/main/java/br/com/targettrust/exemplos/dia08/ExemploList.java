package br.com.targettrust.exemplos.dia08;

import java.util.*;

public class ExemploList {

    public static void main(String[] args) {

        // List: Aceita elementos duplicados: TEM Java duas vezes na lista
        // página 7 apostila 6 - Coleções ->  ArrayList, LinkedList


        // Criando um LinkedList e populando
        List<String> linguagens = new LinkedList<>();

        linguagens.add("Java");
        linguagens.add("PHP");
        linguagens.add("PHP");
        linguagens.add("C#");
        linguagens.add("JS");
        linguagens.add("Scala");
        linguagens.add("Java");

        System.out.println(linguagens);

        /*System.out.println("Para LinkedList não é uma boa");
        for (int i = 0; i < linguagens.size(); i++) {
            System.out.println(linguagens.get(i));
        }*/

        //imprimirListaUsandoForeach(linguagens);

        //imprimirListaUsandoWhile(linguagens);

        //System.out.println("***********");
       // System.out.println("Métodos");
        //testarMetodosLista(linguagens);

        //Converter em outro tipo de lista
       /* Set<String> lings = new TreeSet<>(linguagens);
        System.out.println(lings);*/
    }

    private static void testarMetodosLista(List<String> linguagens) {

        // Na lista tem uma linguagem PHP? Usar método contains
        System.out.println("Contains: " + linguagens.contains("PHP"));

        // Qual posição da lista tem Java? -> indexOf (primeira ocorrência)
        System.out.println("IndexOf :" + linguagens.indexOf("Java"));

        // Qual posição da lista tem Java? -> lastIndexOf (última ocorrência)
        System.out.println("LastIndexOf: " + linguagens.lastIndexOf("Java"));

        // Como remover Java da lista? -> remove
        boolean removeuJava = linguagens.remove("Java");
        System.out.println("Remove Java " + removeuJava);

        boolean removeuJava2 = linguagens.remove("Java2");
        System.out.println("Remove Java2 " + removeuJava2);

        // Inserir na posição 0 a linguagem Kotlin
        linguagens.add(0, "Cobol");
        linguagens.set(0, "Kotlin");

        System.out.println("*******************");
        imprimirListaUsandoForeach(linguagens);
        // Limpa a lista -> remove todos os elementos
        linguagens.clear();
        System.out.println("++++++++++++++++++");
        imprimirListaUsandoForeach(linguagens);

    }

    private static void imprimirListaUsandoWhile(List<String> linguagens) {
        System.out.println("=========");
        Iterator<String> iterator = linguagens.iterator();
        while (iterator.hasNext()) {
            //i++
            //numeros[i]
            String ling = iterator.next();
            System.out.println(ling);
        }
/*
        Iterator -> Precisamos de um objeto que permita iterar na lista
        iterator.hasNext -> verifica se tem um próximo elemento
        next -> acessa o elemento, similar a numeros[i]
*/
    }

    private static void imprimirListaUsandoForeach(List<String> linguagens) {
        //System.out.println("########");
        for (String ling: linguagens) {
            System.out.println(ling);
        }
    }
}
