package br.com.targettrust.exemplos.dia10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 - Crie uma classe `Produto` com os atributos: `nome`, `custoAquisicao`, `valorVenda`.

 - Crie uma classe `ExercicioOrdenacao` com o método `main`.

 - Crie os produtos na lista.

 - Imprima a lista:

 + Ordenada por `nome`.
 + Ordenada por `custoAquisicao`.

 Produtos:

 Nome, CustoAquisicao, ValorVenda

 Creme Dental 90g, R$ 2,49, R$ 2,99
 Sabonete em Barra Corporal 90g, R$ 2,99, R$ 3,30
 Protetor Solar 30 FPS 200ml, R$ 37,39, R$ 39,12
 Fralda P Confort - 50 Unidades, R$ 44,90, R$ 44,90
 Condicionador 200ml, R$ 18,90, R$ 19,50

 */
public class ExercicioOrdenacao {

    public static void main(String[] args) {

        Produto cremeDental = new Produto();
        cremeDental.setNome("Creme Dental 90g");
        cremeDental.setCustoAquisicao(2.49);
        cremeDental.setValorVenda(2.99);

        Produto sabonete = new Produto();
        sabonete.setNome("Sabonete em Barra Corporal 90g");
        sabonete.setCustoAquisicao(2.99);
        sabonete.setValorVenda(3.30);

        Produto protetorSolar = new Produto();
        protetorSolar.setNome("Protetor Solar 30 FPS 200ml");
        protetorSolar.setCustoAquisicao(37.39);
        protetorSolar.setValorVenda(39.12);

        Produto fralda = new Produto();
        fralda.setNome("Fralda P Confort - 50 Unidades");
        fralda.setCustoAquisicao(44.90);
        fralda.setValorVenda(44.90);

        Produto condicionador = new Produto();
        condicionador.setNome("Condicionador 200ml");
        condicionador.setCustoAquisicao(18.90);
        condicionador.setValorVenda(19.50);

        List<Produto> produtos = new ArrayList<>();
        produtos.add(cremeDental);
        produtos.add(sabonete);
        produtos.add(protetorSolar);
        produtos.add(fralda);
        produtos.add(condicionador);

        ProdutoByNomeComparator produtoByNomeComparator = new ProdutoByNomeComparator();
        Collections.sort(produtos, produtoByNomeComparator);
        System.out.println(produtos);

        ProdutoByCustoAquisicaoComparator produtoByCustoAquisicaoComparator = new ProdutoByCustoAquisicaoComparator();
        Collections.sort(produtos, produtoByCustoAquisicaoComparator);
        System.out.println("Ordenado pelo custo de aquisição");
        System.out.println(produtos);


    }


}
