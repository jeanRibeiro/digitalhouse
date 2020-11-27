package br.com.aula15

import kotlin.random.Random

class Venda () {
    var codigo:Int = 0;
    var valor:Double = 0.0;

    init {
        codigo = Random.nextInt(0, 100);
    }

    fun efetuarVenda(livro: Livro, qtdVendida:Int, estoqueLivro: EstoqueLivro):Boolean{
        if(livro.qtdEstoque == 0){
            println("Não é possível efetuar a venda!");
            println("Produto sem estoque.");
            return false;
        }

        if(livro.qtdEstoque < qtdVendida){
            println("Não é possível efetuar a venda!");
            println("Estoque atual: ${livro.qtdEstoque}");
            println("Quantidade de itens a ser vendido: $qtdVendida");
            return false;
        }

        livro.qtdEstoque -= qtdVendida;
        estoqueLivro.addLivroALista(livro);

        return true;
    }

}