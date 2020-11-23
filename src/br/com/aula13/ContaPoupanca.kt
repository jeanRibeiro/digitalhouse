package br.com.aula13

class ContaPoupanca(var taxaDeOperacao:Double, numeroConta:Int) :ContaBancaria(numeroConta), Imprimivel {

    //veio da classe abstrata
    open override fun depositar(valor:Double){
        saldo += valor;
        println("Depósito realizado com sucesso!");
        //mostrarDados();
    }
    override fun sacar(valor:Double){
        if((saldo - valor) < 0){
            println("Não foi possível efetuar o saque!")
            println("Saldo indisponível.")
            return;
        }

        saldo -= valor;
        println("Saque realizado com sucesso!");
        //mostrarDados();
    }


    //veio da interface
    override fun mostrarDados() {
        println("Conta Poupança!");
        println("Número: $numeroConta");
        println("Taxa de Operação: $taxaDeOperacao%");
        println("Saldo atual: R$$saldo");
    }

}