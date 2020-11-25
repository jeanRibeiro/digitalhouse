package br.com.aula13

class ContaCorrente(var limite:Double, numeroConta:Int) :ContaBancaria(numeroConta), Imprimivel {

    //veio da classe abstrata
    override fun depositar(valor:Double){
        saldo += valor;
        println("Depósito realizado com sucesso!");
        //mostrarDados();
    }
    override fun sacar(valor:Double){

        if((saldo - valor) < -limite){
            println("Operação não permitida!")
            println("valor R$$valor solicitado ultrapassa saldo e limite.")
            return;
        }

        saldo -= valor;

        if((saldo - valor) < 0){
            println("Atenção! Você entrou no cheque especial!")
            limite -= -saldo;
        }

        println("Saque realizado com sucesso!");
        //mostrarDados();
    }

    override fun transferir(valor: Double, contaBancaria: ContaBancaria) {
        TODO("Not yet implemented")
    }


    //veio da interface
    override fun mostrarDados() {
        println("Conta Corrente!");
        println("Número: $numeroConta");
        println("Saldo atual: R$$saldo");
        println("Limite atual: R$$limite");
    }


}