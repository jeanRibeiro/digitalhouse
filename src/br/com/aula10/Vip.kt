package br.com.aula10

abstract class Vip(valorIngresso :Double) :Ingresso(valorIngresso) {

    var valorAdicional :Double = 0.0;

    constructor(valorIngresso: Double, valorAdicional :Double) :this(valorIngresso){
        this.valorAdicional = valorAdicional;
    }

    //sobrescrevendo funções de Ingresso

    override fun retornaValor() :Double{
        var valorFinal = super.retornaValor() + valorAdicional;
        println("O valor do ingresso vip é: R$$valorFinal, sendo R${super.valor} como valor do ingresso e R$$valorAdicional como valor adicional.")
        return valorFinal;
    }
    override fun imprimeDescricao(){
        println("Esse ingresso é do tipo VIP");
    }



}