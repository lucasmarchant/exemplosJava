package br.com.targettrust.exemplos.dia09.ordenacao.ex2;

import java.util.Comparator;

public class ClienteByNomeComparator implements Comparator<Cliente> {

    public int compare(Cliente c1, Cliente c2) {
        return c1.nome.compareTo(c2.nome);
    }
}
