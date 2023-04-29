package br.com.targettrust.exemplos.dia13;

import java.util.List;

public class ProfessorTemporario extends Professor{
    private Integer dias;

    public ProfessorTemporario() {
    }

    public ProfessorTemporario(String nome, String documento, String endereco, List<String> cursosMinistados, Integer dias) {
        super(nome, documento, endereco, cursosMinistados);
        this.dias = dias;
    }

    public Integer getDias() {
        return dias;
    }

    public void setDias(Integer dias) {
        this.dias = dias;
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }
}
