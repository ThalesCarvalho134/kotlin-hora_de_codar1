package org.example

fun main(){
println("Digite 4 notas de 0 a 10")
   print("Digite a primeira nota: ")
    var nota1 = readln().toInt()
    while (nota1<0 || nota1>10){
        var nota1 = readln().toInt()
    }
   print("Digite a segunda nota: ")
    var nota2 = readln().toInt()
    while (nota2<0 || nota2>10){
        var nota2 = readln().toInt()
    }
   print("Digite a terceira nota: ")
    var nota3 = readln().toInt()
    while (nota3<0 || nota3>10){
        var nota3 = readln().toInt()
    }
   print("Digite a terceira nota: ")
    var nota4 = readln().toInt()
    while (nota4<0 || nota4>10){
        var nota4 = readln().toInt()
    }

    if ((nota1+nota2+nota3+nota4)/4>=5){
        println("Parabéns! Você passou no teste.")
    }
    if ((nota1+nota2+nota3+nota4)/4<5){
        println("Que pena! Você não passou no teste.")
    }
}