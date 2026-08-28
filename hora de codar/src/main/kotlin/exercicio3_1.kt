package org.example

fun main(){
    var contagem = 30

    while (contagem >= 1){
        Thread.sleep(1000)
        println ("$contagem")
        contagem--
    }
    if (contagem == 0){
        println("EXPLOSÃO!")
    }
}