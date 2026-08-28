package org.example

fun main(){
    println("Escreva 4 números")
    var r1 = readln().toInt()
    var r2 = readln().toInt()
    var r3 = readln().toInt()
    var r4 = readln().toInt()

    print("O primeiro número foi $r1, o último foi $r4 e o maior foi ")

    if(r1>r2 && r1>r3 && r1>r4){
        println("$r1")
    }
    if(r2>r1 && r2>r3 && r2>r4){
        println("$r2")
    }
    if(r3>r1 && r3>r2 && r3>r4){
        println("$r3")
    }
    if(r4>r1 && r4>r2 && r4>r3) {
        println("$r4")
    }



}