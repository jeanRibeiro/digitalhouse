package br.com.aula10

abstract class Ingresso (var valor :Double){

    open fun imprimeValor(){
        println("Valor do ingresso: R$$valor");
    }

    open fun retornaValor() :Double{
        return valor;
    }

    open fun imprimeDescricao(){
        println("O ingresso foi criado!");
    }


}