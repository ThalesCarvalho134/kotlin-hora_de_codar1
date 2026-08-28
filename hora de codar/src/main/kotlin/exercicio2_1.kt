package org.example

fun main(){
    println("Digite um número: ")
    val n1 = readln().toDouble()
    println("Digite mais um número: ")
    val n2: Double = readln().toDouble()


    if (n1>n2){
        println("O maior é $n1")
    }
    else{
        println("O maior é $n2")
    }
}