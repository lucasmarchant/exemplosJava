package br.com.targettrust.exemplos.dia10;

import java.util.Comparator;

public class ProdutoByNomeComparator implements Comparator<Produto> {

    @Override
    public int compare(Produto produtoAtual, Produto outroProduto) {
        return produtoAtual.getNome().compareTo(outroProduto.getNome());
    }
}
