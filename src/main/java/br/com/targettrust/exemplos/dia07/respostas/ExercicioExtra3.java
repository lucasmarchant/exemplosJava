package br.com.targettrust.exemplos.dia07.respostas;

public class ExercicioExtra3 {

    // Verificar classe de teste ExercicioExtra3Test.java
    /**
     Faça um método que recebe um número inteiro correspondente a idade de uma pessoa, retornar textualmente de
     acordo com as regras:

         Se menor que 12 retornar "Criança".
         Se entre 12 e 18 retornar "Adolescente".
         Se maior que 18 retornar "Adulto".

     Exemplo: entrada: 13, retorno: "Adolescente"

     */
    public static String verificarFaixaEtaria(int idade){
        if(idade < 12) {
            return "Criança";
        } else if (idade >=12 && idade <= 18) {
            return "Adolescente";
        } else {
            return "Adulto";
        }
    }
}
