package org.example

fun main(){

    var acumulador = 0
    var contador = 0

    print("Digite o primeiro número: ")
    var valor1 = readln().toInt()
    print("Digite o segundo valor: ")
    var valor2 = readln().toInt()
    while (valor1 > valor2){
        print("Houve um erro! O segundo número precisa ser maior que o primeiro. Digite o segundo valor novamente: ")
        valor2 = readln().toInt()
    }

    while (valor1 < valor2){
        valor1++
        acumulador+=valor1
        contador++
    }

    println("Há $contador números no intervalo")
    var mediaR = acumulador/ contador

    println("A média é de todos os números entre o $valor1 e o $valor2 é $mediaR")
}