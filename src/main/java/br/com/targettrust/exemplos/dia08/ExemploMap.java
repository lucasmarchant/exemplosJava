package br.com.targettrust.exemplos.dia08;

import java.util.LinkedHashMap;
import java.util.Map;

public class ExemploMap {

    public static void main(String[] args) {

        // Map: Guarda coleções de tuplas de valores (chave e valor)
        // página 9 apostila 6 - Coleções
        Map<String, String> capitais = new LinkedHashMap<>();

        capitais.put("RS", "Porto Alegre");
        capitais.put("SC", "Floripa");
        capitais.put("SP", "São Paulo");
        capitais.put("MG", "Belo Horizonte");
        capitais.put("PR", "Curitiba");
        capitais.put("PR", "Curitibanos");
        capitais.put("AC", "Rio Branco");
        capitais.put(null, "abc");
        capitais.put(null, "def");

        //listarKeys(capitais);

        //listarValues(capitais);

        listarKeyValue(capitais);

        System.out.println("Capital de MG: " + capitais.get("MG"));

        String rj = capitais.get("RJ");
        System.out.println("RJ " + rj);

        // testando antes de inserir
        if(rj == null) {
            capitais.put("RJ", "Rio de Janeiro");
        }

        rj = capitais.get("RJ");
        System.out.println("RJ " + rj);

    }

    private static void listarKeyValue(Map<String, String> capitais) {

        System.out.println("Chave/valor (Entry):");

        for (Map.Entry<String, String> registro : capitais.entrySet()) {
            System.out.printf("Capitais: %s - %s \n", registro.getKey(), registro.getValue());
        }
    }

    private static void listarValues(Map<String, String> capitais) {
        System.out.println("Cidade:");
        for (String value : capitais.values()) {
            System.out.println(value);
        }
    }

    private static void listarKeys(Map<String, String> capitais) {
        System.out.println("Estado:");
        for (String key : capitais.keySet()) {
            System.out.println(key);
        }
    }
}
