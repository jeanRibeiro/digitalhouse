package br.com.aula8

fun main() {

    //crio o cliente
    val objetoCliente1 = Cliente(1010, "Douglas", 123456, 100200389);



    //crio uma conta poupança e a movimento
    val contaPoupanca = ContaPoupanca(objetoCliente1);
    contaPoupanca.taxaJuros = 6.0;

    println("-- Operação: Conta Poupança");
    var saldo = contaPoupanca.depositarDinheiro(100.0);
    println("Saldo atual: R$$saldo");

    saldo = contaPoupanca.sacarDinheiro(10.0);
    println("Saldo atual: R$$saldo\n");



    //crio uma conta corrente e a movimento
    val contaCorrente = ContaCorrente(objetoCliente1);
    contaCorrente.limiteChequeEspecial = 2000.00;

    println("-- Operação: Conta Corrente");
    var saldoContaCorrente = contaCorrente.depositarDinheiro(350.0);
    println("Saldo atual: R$$saldoContaCorrente");

    saldoContaCorrente = contaCorrente.sacarDinheiro(1000.0);
    println("Saldo atual: R$$saldoContaCorrente\n");


}