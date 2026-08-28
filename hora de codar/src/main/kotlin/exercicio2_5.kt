package org.example

fun main(){
    println("Escreva 6 números: ")
    var valor1 = readln().toInt()
    var valor2 = readln().toInt()
    var valor3 = readln().toInt()
    var valor4 = readln().toInt()
    var valor5 = readln().toInt()
    var valor6 = readln().toInt()

    println("Os números digitados foram: $valor1, $valor2, $valor3, $valor4, $valor5 e $valor6")
    var media_aritmetica = (valor1+valor2+valor3+valor4+valor5+valor6)/6
    println("A média aritmetica de todos esses números é $media_aritmetica")
}