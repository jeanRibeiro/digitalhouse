package br.com.aula13

class ContaPoupanca(var taxaDeOperacao:Double, numeroConta:Int) :ContaBancaria(numeroConta), Imprimivel {

    //veio da classe abstrata
    open override fun depositar(valor:Double){
    }
    override fun sacar(valor:Double){
        if( valor <= saldo  ){
            saldo
        }
    }

    override fun mostrarDados() {
        println("A conta $numeroConta possui a taxa $taxaDeOperacao%")
    }


}