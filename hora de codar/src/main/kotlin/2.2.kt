package org.example

fun main(){
    println("Escreva um número: ")
    val numero = readln().toDouble()

    if (numero>0) {
        println("Este número é positivo.")
    }
    else if (numero<0){
        println("Este número é negativo.")
    }
    else {
        println("Este número é zero.")
    }
}