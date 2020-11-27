package br.com.aula15

import java.lang.Exception
import java.util.*

data class Livro (
        var codigo: Int,
        var titulo: String,
        var autor: String,
        var anoLancamento: Int,
        var codigoIsbn: Int,
        var qtdEstoque: Int,
        var preco: Double) {

    init {
        //println("Criando objeto livro...");
    }

    fun cadastrarLivro(livro: Livro, estoqueLivro: EstoqueLivro):Boolean{
        try {
            println("Cadastrando...");

            if(addEstoquePraLivro(livro.codigo, livro.qtdEstoque, estoqueLivro)){
                println("Estoque atualizado!");
                return true;
            }

            println("Seguindo com cadastro...")

            estoqueLivro.addLivroALista(livro);

            println("Livro cadastrado com sucesso!");

            return true;
        }
        catch (e:Exception){
            println("Ooops! Algo de errado aconteceu.");
            println("Erro: $e");
            println("Refaça a operação!");
            return false;
        }
    }
    fun consultarLivro(codigoLivro: Int, estoqueLivro: EstoqueLivro): Livro? {
        println("Consultando exemplar no estoque...");

        var livroEncontrado: Livro? = null;

        var livros = estoqueLivro.consultaTodosLivros();

        for (livro in livros){
            if(livro.codigo == codigoLivro){
                livroEncontrado = livro;
                println("Livro encontrado!");
                break;
            }
        }

        if(livroEncontrado == null){
            //println("Livro com código [$codigoLivro] não foi encontrado.");
        }

        return livroEncontrado;
    }
    fun addEstoquePraLivro(codigoLivroEntrada: Int, qtdEntradaDeEstoque: Int, estoqueLivro: EstoqueLivro):Boolean{
        var livroEncontrado:Livro? = consultarLivro(codigoLivroEntrada, estoqueLivro);

        if(livroEncontrado != null){
            livroEncontrado.qtdEstoque += qtdEntradaDeEstoque;
            return true;
        }

        println("Livro ainda não foi incluído!");
        return false;
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Livro

        if (codigo != other.codigo) return false

        return true
    }




}