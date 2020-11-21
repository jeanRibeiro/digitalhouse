package br.com.aula13

fun main() {

    val contaPoupanca = ContaPoupanca(100.0, 123);
    val contaCorrente = ContaCorrente(100.0, 123)

    contaPoupanca.depositar(100.0)
    contaPoupanca.sacar(10.0)

    contaCorrente.depositar(10.0)

}