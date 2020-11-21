package br.com.aula8

import java.util.*

class ContaCorrente(objetoCliente: Cliente) :Conta(objetoCliente) {

    init {
        println("----------------------------------------------------------------------")
        println("----------     CONTA CORRENTE CRIADA - CLIENTE - ${objetoCliente.numeroCliente}     ")
        println("----------------------------------------------------------------------")
    }

    //propriedades
    var limiteChequeEspecial :Double = 0.0;


    //funções
    fun depositarCheques() :Double{
        return 0.0;
    }
    fun consultarSaldoTotalAtual() :Double {
        var saldoParcial = saldo+limiteChequeEspecial;
        println("-- Saldo detalhado")
        println("Saldo total: [R$$saldoParcial], sendo [R$$saldo] como saldo comum e [R$$limiteChequeEspecial] como limite do cheque especial.")
        println("-- ")
        return saldoParcial;
    }
    override fun sacarDinheiro(valor: Double) :Double {
        println("Sacando [R$$valor] em dinheiro...");

        if(valor == 0.0){
            println("Não foi possível sacar! Valor informado é inválido.")
            return consultarSaldo();
        }

        var saldoTotal = consultarSaldoTotalAtual();

        var saldoAtualTemporario = consultarSaldo();
        saldoAtualTemporario -= valor;

        //verifico se o cliente tem saldo suficiente para efetuar o saque
        if(saldoAtualTemporario >= 0){
            saldo -= valor;
            println("Saque realizado som sucesso!");
            return consultarSaldo();
        }

        var valorUtilizadoChequeEspecial = saldoTotal - valor;
        if(saldoTotal >= valorUtilizadoChequeEspecial){
            saldo -= valor;

            var limiteUtilizado = (saldo *(-1));

            limiteChequeEspecial -= limiteUtilizado;

            println("Você entrou no cheque especial por [R$$limiteUtilizado]!");
            println("Saque realizado som sucesso!");

            return consultarSaldoTotalAtual();
        }

        println("Saldo insuficiente!")

        return consultarSaldo();
    }



}