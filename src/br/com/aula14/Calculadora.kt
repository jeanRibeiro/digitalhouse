package br.com.aula14

class Calculadora :OperacoesMatematicas{
    var listaNumeros = mutableListOf<String>();
    var listaOperadores = mutableListOf<String>();

    init {
        println("Preenchendo a lista com números...");
        for (i in 0..9){
            listaNumeros.add("$i");
        }

        println("Preenchendo a lista com operadores...");
        listaOperadores.add("-");
        listaOperadores.add("+");
        listaOperadores.add("/");
        listaOperadores.add("*");
        listaOperadores.add(".");
        listaOperadores.add(",");
    }

    fun calcularSemInterface(numero1:Double, numero2:Double, operador:String):Double{

        if(operador.equals("+")){
            return numero1+numero2;
        }
        if(operador.equals("-")){
            return numero1-numero2;
        }
        if(operador.equals("/")){
            return numero1/numero2;
        }
        if(operador.equals("*")){
            return numero1*numero2;
        }

        return -1.0;
    }

    fun calcularComInterface(numero1:Double, numero2:Double, operador:String):Double{

        if(operador.equals("+")){
            return somar(numero1, numero2);
        }
        if(operador.equals("-")){
            return subtrair(numero1, numero2);
        }
        if(operador.equals("/")){
            return dividir(numero1, numero2);
        }
        if(operador.equals("*")){
            return multiplicar(numero1, numero2);
        }

        return -1.0;
    }




}