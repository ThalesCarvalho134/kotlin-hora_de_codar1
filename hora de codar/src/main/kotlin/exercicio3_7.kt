package org.example

fun main(){

    var conta = 1

    print("Digite um valor: ")
    var n = readln().toInt()

    while (n<=0){
        print("Erro! Digite um número maior que 0")
    }
    while (conta <= n){
        println("$conta")
        conta++
    }

    print("Fim da contagem!")

}