package br.com.aula13

class ContaCorrente(var limite:Double, numeroConta:Int) :ContaBancaria(numeroConta), Imprimivel {

    init {
        limite = 100.0
    }

    //veio da classe abstrata
    override fun depositar(valor:Double){
        saldo += valor;
    }
    override fun sacar(valor:Double){
        var saldoTemporario = saldo - valor;

        if(saldoTemporario < limite+saldo){
            println("Saque não permitido!");
            return;
        }



        if(valor <= saldo){
            println("O saque foi realizado!")
        }
        saldo -= valor


    }

    //veio da interface
    override fun mostrarDados() {
        println("A conta $numeroConta possui o limite R$$limite")
    }


}