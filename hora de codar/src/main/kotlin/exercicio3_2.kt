package org.example

fun main(){
    print("Digite um número: ")
    val v1 = readln().toInt()
    print("Digite outro número: ")
    val v2 = readln().toInt()

    while (v2 <= 0){
        println("Houve um erro! O segundo valor precisa ser maior que 0: ")
        val v2 = readln().toInt()
    }

    print("$v1 dividido por $v2 é igual a ${v1/v2}")
}