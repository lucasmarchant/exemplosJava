package br.com.targettrust.exemplos.dia08;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {

    public static void main(String[] args) {

        // Set: Não aceita elementos duplicados
        // página 8 apostila 6 - Coleções -> LinkedHashSet, HashSet,

        //TreeSet: Ordena automaticamente os elementos de acordo com seu valor
        //listarUsandoTreeSet();

        // HashSet: Não garante ordenação
        //listarUsandoHashSet();

        // LinkedHashSet: Matém ordem de inserção
        listarUsandoLinkedHashSet();

    }

    private static void listarUsandoHashSet() {
        System.out.println("- FRUTAS - ");

        Set<String> frutas = new HashSet<>();

        frutas.add("banana");
        frutas.add("maçã");
        frutas.add("manga");
        frutas.add("limão");
        frutas.add("pera");
        frutas.add("morango");
        frutas.add("morango");
        frutas.add("melão");

        for (String fruta : frutas) {
            System.out.println(fruta);
        }
    }

    private static void listarUsandoLinkedHashSet() {

        System.out.println("- PESSOAS -");

        Set<String> pessoas = new LinkedHashSet<>();

        pessoas.add("Thiago");
        pessoas.add("Jhonny");
        pessoas.add("Maria");
        pessoas.add("Paulo");
        pessoas.add("Daniel");
        pessoas.add("Alice");
        pessoas.add("Thiago");

        for (String pessoa : pessoas) {
            System.out.println(pessoa);
        }
    }

    private static void listarUsandoTreeSet() {

        System.out.println("- FABRICANTES -");

        Set<String> fabricantes = new TreeSet<>();

        fabricantes.add("Dell");
        fabricantes.add("HP");
        fabricantes.add("Dell");
        fabricantes.add("Lenovo");
        fabricantes.add("Apple");

        for (String fabricante : fabricantes) {
            System.out.println(fabricante);
        }

        Set<Integer> numeros = new TreeSet<>();
        numeros.add(100);
        numeros.add(20);
        numeros.add(5);
        numeros.add(1000);

        for (Integer numero : numeros) {
            System.out.println(numero);
        }
    }
}
