package br.com.aula14

interface OperacoesMatematicas {

    fun somar(numero1:Double=0.0, numero2:Double=0.0):Double{
        return numero1+numero2;
    }

    fun subtrair(numero1:Double=0.0, numero2:Double=0.0):Double{
        return numero1-numero2;
    }

    fun multiplicar(numero1:Double=0.0, numero2:Double=0.0):Double{
        return numero1*numero2;
    }

    fun dividir(numero1:Double=0.0, numero2:Double=0.0):Double{
        return numero1/numero2;
    }

}