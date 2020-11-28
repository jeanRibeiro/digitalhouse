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

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Livro

        if (codigo != other.codigo) return false

        return true
    }

}