package br.com.aula10

class CamaroteSuperior (valorIngresso :Double, valorAdicional :Double) :Vip(valorIngresso, valorAdicional){

//    constructor(valorParaIngresso: Double, valorAdicional :Double) :this(valorParaIngresso){
//        this.valorAdicional = valorAdicional;
//    }

    override fun imprimeDescricao(){
        println("Ingresso VIP Camarote Superior!")
    }

    override fun imprimeValor(){
        retornaValor();
    }

}