package br.com.targettrust.exemplos.dia09.ordenacao.ex2;

import br.com.targettrust.exemplos.dia09.ordenacao.ex1.Conta;

import java.util.*;

public class ClienteListagem {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        cliente1.nome = "João";
        cliente1.cpf = 123456;

        Cliente cliente2 = new Cliente();
        cliente2.nome = "Adriano";
        cliente2.cpf = 456789;

        Cliente cliente3 = new Cliente();
        cliente3.nome = "Zalando";
        cliente3.cpf = 876543;

        List<Cliente> clientes = new ArrayList<>();
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);

        System.out.println("Ordenando pelo nome do cliente");
        ClienteByNomeComparator comparator = new ClienteByNomeComparator();
        Collections.sort(clientes, comparator);
        System.out.println(clientes);

        System.out.println("Ordenando pelo cpf do cliente");
        ClienteByCpfComparator comparatorByCpf = new ClienteByCpfComparator();
        Collections.sort(clientes, comparatorByCpf);
        System.out.println(clientes);


    }
}
