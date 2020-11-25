package br.com.aula13

class Banco() {

    var listaDeContas = mutableListOf<ContaBancaria>();

    fun inserirConta(contaBancaria: ContaBancaria){
        listaDeContas.add(contaBancaria);
    }
    fun removerConta(contaBancaria: ContaBancaria){

    }
    fun procurarConta(){

    }


}