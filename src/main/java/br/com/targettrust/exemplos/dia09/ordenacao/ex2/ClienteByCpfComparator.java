package br.com.targettrust.exemplos.dia09.ordenacao.ex2;

import java.util.Comparator;

public class ClienteByCpfComparator implements Comparator<Cliente> {


    @Override
    public int compare(Cliente clienteAtual, Cliente outroCliente) {
        return clienteAtual.cpf.compareTo(outroCliente.cpf);
    }
}
