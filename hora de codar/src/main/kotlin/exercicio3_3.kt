package org.example

fun main(){

    var soma = 0

    for (cont in 15..100){
        soma+=cont
    }
    val media = soma.toDouble() / 85

    println("A média aritmética dos números de 15 a 100 é $media")

}