package br.com.targettrust.exemplos.dia13;

public class Aluno extends Pessoa{

    @Override
    public void setNome(String nome) {
        super.setNome(nome.toUpperCase());
    }
}
