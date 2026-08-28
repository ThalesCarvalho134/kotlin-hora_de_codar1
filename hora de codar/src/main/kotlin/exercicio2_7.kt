package org.example

fun main(){
    println("Digite 6 números")
    var m1 = readln().toInt()
    var m2 = readln().toInt()
    var m3 = readln().toInt()
    var m4 = readln().toInt()
    var m5 = readln().toInt()
    var m6 = readln().toInt()
    var soma = 0


    if (m1<72){
        soma=soma+m1
    }
    if (m2<72){
        soma=soma+m2
    }
    if (m3<72){
        soma=soma+m3
    }
    if (m4<72){
        soma=soma+m4
    }
    if (m5<72){
        soma=soma+m5
    }
    if (m6<72){
        soma=soma+m6
    }

    println("A soma dos valores menores que 72 é $soma")
    println("A soma de todos os valores é ${m1+m2+m3+m4+m5+m6}")

}