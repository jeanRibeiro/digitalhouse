package br.com.aula13

fun main() {

    val contaPoupanca = ContaPoupanca(100.0, 123);
    val contaCorrente = ContaCorrente(100.0, 123);

    println("   ");
    println("----------   Conta Poupança   ----------");
    contaPoupanca.depositar(100.0);
    contaPoupanca.sacar(10.0);
    println("----------------------------------------")
    println("   ");

    println("----------   Conta Corrente   ----------");
    contaCorrente.depositar(10.0);
    contaCorrente.sacar(50.0);
    println("----------------------------------------");
    println("   ");

    println("----------   Relatório   ----------");
    val relatorio = Relatorio();
    relatorio.gerarRelatorio(contaPoupanca);
    relatorio.gerarRelatorio(contaCorrente);
    println("-----------------------------------");
    println("   ");

    println("----------   Transferências   ----------");
    //teste de transferência para a mesma conta
    // contaPoupanca.transferir(10.0, contaCorrente);
    //teste de transferência para outra conta
    val contaCorrenteJean = ContaCorrente(100.0, 123456);
    contaPoupanca.transferir(10.0, contaCorrenteJean);
    println("----------------------------------------");
    println("   ");
}