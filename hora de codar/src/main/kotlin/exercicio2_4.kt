package org.example

fun main(){
    print("Digite um número: ")
    var v1 = readln().toInt()
    print("Digite mais um número: ")
    var v2 = readln().toInt()
    print("Digite um outro número: ")
    var v3 = readln().toInt()

    if (v1>v3 && v2>v3){
        var soma = v1 + v2
        println("A soma dos dois maiores números é $soma")
    }
    if (v1>v2 && v3>v2){
        var soma = v1 + v3
        println("A soma dos dois maiores números é $soma")
    }
    if (v2>v1 && v3>v1){
        var soma = v2 + v3
        println("A soma dos dois maiores números é $soma")
    }



}