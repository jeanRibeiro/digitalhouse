package br.com.aula10

class Normal(var valorNormal :Double) :Ingresso(valorNormal) {

    override fun imprimeDescricao(){
        println("Ingresso Normal");
    }

}