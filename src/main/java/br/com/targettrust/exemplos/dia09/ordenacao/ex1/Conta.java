package br.com.targettrust.exemplos.dia09.ordenacao.ex1;

public class Conta implements Comparable<Conta> {

    // private - própria classe, usar getters e setters
    // protected - mesmo pacote ou por subclasses
    // public - qualquer outra classe
    // sem nada é package (default) - mesmo pacote
    // -> vale para atributos ou métodos
    String nome;
    double saldoTotal;

    public double getSaldoTotal() {
        return saldoTotal;
    }

    public void setSaldoTotal(double saldoTotal) {
        this.saldoTotal = saldoTotal;
    }

    // somente leitura
    public String getNome() {
        return nome.substring(0,20) + "...";
    }

    // escrever
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Conta(){
        System.out.println(nome);

    }

    public static void metodo() {

    }
    public Conta(String nome) {
        this.nome = nome;
    }

    private void umMetodoQualquer() {
        // implementação
        System.out.println(nome);
    }

    // Joao 100
    // Maria 220
    // Pedro -1100


    @Override
    public int compareTo(Conta proximaConta) {
        if (this.saldoTotal < proximaConta.saldoTotal) {
            return -1; //Se Menor
        }
        if (this.saldoTotal > proximaConta.saldoTotal) {
            return 1; //Se Maior
        }
        return 0; //Se Igual
    }


    // https://www.devmedia.com.br/java-object-class-entendendo-a-classe-object/30513
    @Override
    public String toString() {
        //return "Nome " + nome + " R$ " + saldoTotal;

        return String.format("Nome %s R$ %.2f \n", nome, saldoTotal);
    }

}
