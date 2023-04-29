package br.com.targettrust.exemplos.dia10;

public class Produto {

    private String nome;

    private Double custoAquisicao;

    private Double valorVenda;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getCustoAquisicao() {
        return custoAquisicao;
    }

    public void setCustoAquisicao(Double custoAquisicao) {
        this.custoAquisicao = custoAquisicao;
    }

    public Double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(Double valorVenda) {
        this.valorVenda = valorVenda;
    }

    @Override
    public String toString() {
        return "Produto[" +
                "nome = '" + nome + '\'' +
                ", custoAquisicao = " + custoAquisicao +
                ", valorVenda = " + valorVenda +
                ']' + "\n";
    }
}
