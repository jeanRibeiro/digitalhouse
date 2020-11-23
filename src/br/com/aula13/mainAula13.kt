package br.com.aula13

fun main() {

    val contaPoupanca = ContaPoupanca(100.0, 123);
    val contaCorrente = ContaCorrente(100.0, 123);

    println("Conta Poupança ----------------------------------");
    contaPoupanca.depositar(100.0);
    contaPoupanca.sacar(10.0);

    println("Conta Corrente ----------------------------------");
    contaCorrente.depositar(10.0);
    contaCorrente.sacar(50.0);

    println("Relatório ---------------------------------------");
    val relatorio = Relatorio();

    relatorio.gerarRelatorio(contaPoupanca);
    relatorio.gerarRelatorio(contaCorrente);

    println("Transferências ----------------------------------");
    contaPoupanca.transferir(10.0, contaCorrente);

}