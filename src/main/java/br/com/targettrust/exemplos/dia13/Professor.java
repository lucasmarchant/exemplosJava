package br.com.targettrust.exemplos.dia13;

import java.util.List;

public class Professor extends Pessoa {
    private List<String> cursosMinistados;

    public Professor() {
    }

    public Professor(String nome, String documento, String endereco, List<String> cursosMinistados) {
        super(nome, documento, endereco);
        this.cursosMinistados = cursosMinistados;
    }


    public List<String> getCursosMinistados() {
        return cursosMinistados;
    }

    public void setCursosMinistados(List<String> cursosMinistados) {
        this.cursosMinistados = cursosMinistados;
    }
}
