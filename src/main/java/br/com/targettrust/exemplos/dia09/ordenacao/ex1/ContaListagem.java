package br.com.targettrust.exemplos.dia09.ordenacao.ex1;

import java.util.*;

public class ContaListagem {

    public static void main(String[] args) {

        Conta.metodo();

        List<Conta> contas = new ArrayList<>();

        Conta c1 = new Conta();
        //c1.nome = "Rogerio";
        c1.setNome("Rogerio");
        c1.saldoTotal = 100;

        Conta c2 = new Conta("Lucas");
        c2.nome = "Lucas";
        c2.saldoTotal = 50;

        Conta c3 = new Conta("Gabriela");
        c3.nome = "Gabriela";
        c3.saldoTotal = 80;

        contas.add(c1);
        contas.add(c2);
        contas.add(c3);

        System.out.println("Ordenando por saldo da conta");
        Collections.sort(contas);
        System.out.println(contas);
    }
}
