package br.com.aula15

import java.lang.Exception

class SistemaDeCadastro {

    val estoqueLivro = EstoqueLivro()

    fun cadastrarLivro(livro: Livro):Boolean{
        try {
            println("Cadastrando...");

            if(addEstoquePraLivro(livro.codigo, livro.qtdEstoque)){
                println("Estoque atualizado!");
                return true;
            }

            println("Seguindo com cadastro...")

            estoqueLivro.addLivroALista(livro);

            println("Livro cadastrado com sucesso!");

            return true;
        }
        catch (e: Exception){
            println("Ooops! Algo de errado aconteceu.");
            println("Erro: $e");
            println("Refaça a operação!");
            return false;
        }
    }
    fun consultarLivro(codigoLivro: Int): Livro? {
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
    fun addEstoquePraLivro(codigoLivroEntrada: Int, qtdEntradaDeEstoque: Int):Boolean{
        var livroEncontrado:Livro? = consultarLivro(codigoLivroEntrada);

        if(livroEncontrado != null){
            livroEncontrado.qtdEstoque += qtdEntradaDeEstoque;
            return true;
        }

        println("Livro ainda não foi incluído!");
        return false;
    }
}