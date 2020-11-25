package br.com.aula13

import java.lang.Exception

class ContaPoupanca(var taxaDeOperacao:Double, numeroConta:Int) :ContaBancaria(numeroConta), Imprimivel {

    //veio da classe abstrata
    open override fun depositar(valor:Double):Boolean{
        try {
            saldo += valor;
            println("Depósito realizado com sucesso!");
            //mostrarDados();
            return true;
        }
        catch (e: Exception){
            return false;
        }
    }
    override fun sacar(valor:Double):Boolean {
        if((saldo - valor) < 0){
            println("Não foi possível efetuar o saque!")
            println("Saldo indisponível.")
            return false;
        }

        saldo -= valor;
        println("Saque realizado com sucesso!");
        //mostrarDados();
        return true;
    }
    override fun transferir(valor: Double, contaBancaria: ContaBancaria) {

        if(contaBancaria.numeroConta == numeroConta){
            println("Operação não permitida!");
            println("Informe outra conta ou efetue um depósito.");
            return;
        }

        var sacou = sacar(valor);

        if(sacou){

            var depositou = contaBancaria.depositar(valor);

            if(depositou){
                println("Transferência realizada com sucesso!");
                return;
            }
            else{
                //como fiz o saque da conta atual mas não consegui depositar, devo estornar a operação pra conta não ficar sem o valor que foi sacado
                depositar(valor);
            }
        }

        println("Não foi possível efetuar a transferência!");
        println("Refaça a operação.");
    }


    //veio da interface
    override fun mostrarDados() {
        println("== Conta Poupança!");
        println("Número: $numeroConta");
        println("Taxa de Operação: $taxaDeOperacao%");
        println("Saldo atual: R$$saldo");
    }

}