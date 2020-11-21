package br.com.aula8

open class Conta (cliente :Cliente) {

    //propriedades
    var saldo: Double = 0.0;


    //funções
    open fun consultarSaldo() :Double {
        return saldo;
    }
    open fun depositarDinheiro(valor: Double) :Double {
        println("Depositando [R$$valor] em dinheiro...");

        if(valor == 0.0){
            println("Não foi possível depositar! Valor[R$$valor] informado é inválido.");
            return consultarSaldo();
        }

        saldo += valor;

        println("Depósito realizao som sucesso!");

        return consultarSaldo();
    }
    open fun sacarDinheiro(valor: Double) :Double {
        println("Sacando [R$$valor] em dinheiro...");

        if(valor == 0.0){
            println("Não foi possível sacar! Valor informado é inválido.")
            return consultarSaldo();
        }

        var saldoAtualTemporario = consultarSaldo();
        saldoAtualTemporario -= valor;

        //verifico se o cliente tem saldo suficiente para efetuar o saque
        if(saldoAtualTemporario >= 0){
            saldo -= valor;
            println("Saque realizado som sucesso!");
            return consultarSaldo();
        }

        println("Saldo insuficiente!")

        return consultarSaldo();
    }



}