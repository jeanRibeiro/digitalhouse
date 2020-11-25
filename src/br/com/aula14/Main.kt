package br.com.aula14

import com.sun.jdi.IntegerType
import java.beans.Expression
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf
import kotlin.reflect.jvm.internal.impl.utils.NumbersKt

fun main() {

    var calculadora = Calculadora();
    var expressaoMatematica = "";

//    println("Essa é a lita de números aceitos: ${calculadora.listaNumeros}");
//    println("Essa é a lita de números aceitos: ${calculadora.listaOperadores}");

    println("Digite o primeiro número:");
    var num1 = readLine();
    if(!calculadora.listaNumeros.contains(num1)){
        println("Número não permitido! Digite novamente:");
        while (!calculadora.listaNumeros.contains(num1)){
            num1 = readLine();
            if(!calculadora.listaNumeros.contains(num1)) {
                println("Número não permitido! Digite novamente:");
            }
        }
    }
    expressaoMatematica += "$num1";


    println("Digite a operação desejada:");
    var operador: String? = readLine();
    if(!calculadora.listaOperadores.contains(operador)){
        println("Operação não encontrada!");
        println("Escolha uma das opções: ${calculadora.listaOperadores}");
        while (!calculadora.listaOperadores.contains(operador)){
            operador = readLine();
            if(!calculadora.listaOperadores.contains(operador)) {
                println("Escolha uma das opções: ${calculadora.listaOperadores}");
            }
        }
    }
    expressaoMatematica += "$operador";


    println("Digite o segundo número:");
    var num2 = readLine();
    if(!calculadora.listaNumeros.contains(num2)){
        println("Número não permitido! Digite novamente:");
        while (!calculadora.listaNumeros.contains(num2)){
            num2 = readLine();
            if(!calculadora.listaNumeros.contains(num2)) {
                println("Número não permitido! Digite novamente:");
            }
        }
    }
    expressaoMatematica += "$num2";


    println("--------------------------------------------");
//    println("Primeiro número: $num1");
//    println("Operador: $operador");
//    println("Segundo número: $num2");
    println("Expressão Final: $expressaoMatematica");
    println("Resultado sem interface: "+calculadora.calcularSemInterface(num1!!.toDouble(), num2!!.toDouble(), operador!!));
    println("Resultado com interface: "+calculadora.calcularComInterface(num1!!.toDouble(), num2!!.toDouble(), operador!!));
    println("--------------------------------------------");


//    println("--------------------------------------------");
//    println("----------   DÚVIDA   ----------------------");
//    println("--------------------------------------------");
//
//    //chamar aqui direto
//    var resultado = calculadora.somar(numero2 = num2!!.toDouble(), numero1 = num1!!.toDouble());
//
//    //ou
//
//    //chamar uma função dentro da classe
//    var result = calculadora.calcularComInterface(num1!!.toDouble(), num2!!.toDouble(), operador!!);
//
//    println("--------------------------------------------");









}