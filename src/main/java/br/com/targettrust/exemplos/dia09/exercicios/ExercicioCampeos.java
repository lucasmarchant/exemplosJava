package br.com.targettrust.exemplos.dia09.exercicios;

import java.util.*;

public class ExercicioCampeos {

    public static void main(String[] args) {

        /**
         Brasil - 5
         Itália - 4
         Inglaterra - 1
         Argentina - 2
         França - 2
         Uruguai - 2
         Espanha - 1
         Alemanha - 4
         */

        List<String> campeoes = new ArrayList<>();
        campeoes.add("1930 - Uruguai");
        campeoes.add("1934 - Itália");
        campeoes.add("1938 - Itália");
        campeoes.add("1950 - Uruguai");
        campeoes.add("1954 - Alemanha");
        campeoes.add("1958 - Brasil");
        campeoes.add("1962 - Brasil");
        campeoes.add("1966 - Inglaterra");
        campeoes.add("1970 - Brasil");
        campeoes.add("1974 - Alemanha");
        campeoes.add("1978 - Argentina");
        campeoes.add("1982 - Itália");
        campeoes.add("1986 - Argentina");
        campeoes.add("1990 - Alemanha");
        campeoes.add("1994 - Brasil");
        campeoes.add("1998 - França");
        campeoes.add("2002 - Brasil");
        campeoes.add("2006 - Itália");
        campeoes.add("2010 - Espanha");
        campeoes.add("2014 - Alemanha");
        campeoes.add("2018 - França");

        Map<String, Integer> quantidadeTitulos = new HashMap<>();

        for (String campeao : campeoes) {

            //System.out.println(campeao);
            //"1974 - Alemanha"
            String[] texto = campeao.split(" ");
            //System.out.println(Arrays.toString(texto));

            // só o país
            //String pais = texto[2];
            String pais = texto[texto.length -1];

            //verificar antes para ver se existe o país no map
            Integer valor = quantidadeTitulos.get(pais);
            //quantidadeTitulos.put(pais, 1);

            // é a primeira taça
            if(valor == null) {
                quantidadeTitulos.put(pais, 1);
            } else {
                // incrementar as vitórias
                quantidadeTitulos.put(pais, valor + 1);
            }

        }

        //System.out.println(quantidadeTitulos);

        //Brasil - 5
        for (Map.Entry<String, Integer> pais : quantidadeTitulos.entrySet()) {
            System.out.println(pais.getKey() + " - " + pais.getValue());
        }
    }
}