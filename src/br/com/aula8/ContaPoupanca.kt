package br.com.aula8

class ContaPoupanca (objetoCliente: Cliente) :Conta(objetoCliente) {

    init {
        println("----------------------------------------------------------------------")
        println("----------     CONTA POUPANÇA CRIADA - CLIENTE - ${objetoCliente.numeroCliente}     ")
        println("----------------------------------------------------------------------")
    }

    var taxaJuros :Double = 0.0;

    fun recolherJuros() :Double {
        return 0.0;
    }

}