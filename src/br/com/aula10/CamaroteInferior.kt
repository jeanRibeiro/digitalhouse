package br.com.aula10

class CamaroteInferior (valorIngresso :Double, private var localizacaoDoIngresso :String) :Vip(valorIngresso) {

    fun imprimirLocalizacao(){
        println("Localização do ingresso: $localizacaoDoIngresso");
    }

    override fun imprimeDescricao(){
        println("Ingresso VIP Camarote Inferior!")
    }

}