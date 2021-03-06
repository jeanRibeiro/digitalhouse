package br.com.aula13

abstract class ContaBancaria(var numeroConta: Int) {
    var saldo: Double = 0.0;

    abstract fun depositar(valor:Double):Boolean
    abstract fun sacar(valor:Double):Boolean
    abstract fun transferir(valor:Double, contaBancaria: ContaBancaria)

}