package br.com.targettrust.exemplos.dia10;

import java.util.Comparator;

public class ProdutoByCustoAquisicaoComparator implements Comparator<Produto> {

    @Override
    public int compare(Produto produtoAtual, Produto outroProduto) {
        return outroProduto.getCustoAquisicao().compareTo(produtoAtual.getCustoAquisicao());
    }
}
