package br.com.targettrust.exemplos.dia13;

public class Aplicacao {
    public static void main(String[] args) {
       /* Pessoa pessoa = new Pessoa();
        pessoa.setNome("Thiago");
        pessoa.setDocumento("123456789");*/

       /* Professor professor = new Professor();
        professor.setNome("Bellini");
        professor.setDocumento("987654321");
        professor.setCursosMinistados(Arrays.asList("Java", "Spring Boot"));
*/
        Aluno aluno = new Aluno();
        aluno.setNome("Bruno");

        System.out.println(aluno.getNome());

        //System.out.println(professor.getNome());


        //ProfessorTemporario profTemp = new ProfessorTemporario();
    }
}
