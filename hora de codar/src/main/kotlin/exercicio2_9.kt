package org.example

fun main() {
    print("Em que ano você nasceu: ")
    var nasc = readln().toInt()
    print("Em que ano estamos: ")
    var ano_atual = readln().toInt()

    if (ano_atual - nasc <= 15){
        println("Você não pode votar com sua idade atual")
    }
    if (ano_atual - nasc >= 16){
        println("Você pode votar com sua idade atual")
    }

}