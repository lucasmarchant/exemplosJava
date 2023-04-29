package br.com.targettrust.exemplos.dia09.exercicios;


import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 - Crie uma coleção de Strings vazia chamada `pessoas`.

 - Adicione os nomes: Bryana, Kiersten, Zaneta, Frank, Bryana, Tedi, Marigold, Devan, Jerrilyn,
 Isac, Kathrine.

 - Imprima a lista completa.

 - Crie uma nova coleção de Strings chamada `primeiros`.

 - Nesta nova lista, não pode haver repetição.

 - Deve estar ordenada.

 - Deve ter somente os primeiros 5 nomes (algoritmo)

 - Imprima a lista de `primeiros`.
 */
public class ExercicioNomes {

    public static void main(String[] args) {

        List<String> pessoas2 = new ArrayList<>();
        pessoas2.add("Marcia");
        //List<String> pessoas = new ArrayList<>(pessoas2);

        List<String> pessoas = new ArrayList<>();

        pessoas.add("Bryana");
        pessoas.add("Kiersten");
        pessoas.add("Zaneta");
        pessoas.add("Frank");
        pessoas.add("Bryana");
        pessoas.add("Tedi");
        pessoas.add("Marigold");
        pessoas.add("Devan");
        pessoas.add("Jerrilyn");
        pessoas.add("Isac");
        pessoas.add("Kathrine");

        for (String pessoa : pessoas) {
            System.out.println(pessoa);
        }

        // converte List em Set
        Set<String> primeiros = new TreeSet<>(pessoas);

        System.out.println("Lista ordenada: " + primeiros);

        /*int i = 0;
        for(String nome : primeiros) {
            if(i >= 5) {
                primeiros.remove(nome);
            }
            i++;
        }*/

        // https://stackoverflow.com/questions/18448671/how-to-avoid-concurrentmodificationexception-while-removing-elements-from-arr

        int i = 0;
        Iterator<String> iterator = primeiros.iterator();
        while (iterator.hasNext()) {

            //String nome = iterator.next();
            iterator.next();

            if(i >= 5) {
                iterator.remove();
            }
            i++;
        }
        System.out.println("5 primeiros nomes: " + primeiros);

    }

}