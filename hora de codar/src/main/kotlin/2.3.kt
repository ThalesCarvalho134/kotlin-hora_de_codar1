package org.example

fun main(){
    println("Digite um número: ")
    var x = readln().toInt()
    println("Digite mais um número: ")
    var y = readln().toInt()
    println("Digite o último número: ")
    var z = readln().toInt()

    if (x>y && x>z){
        println("O maior número é $x")
    }
    if (y>x && y>z){
        println("O maior número é $y")
    }
    else{
        println("O maior número é $z")
    }
}