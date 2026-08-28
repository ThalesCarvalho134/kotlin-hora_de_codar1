package org.example

fun main(){
    var soma = 0.0

    for (i in 1..6) {
        var nota: Double
        do {
            print("Informe a $i° nota (0 a 10): ")
            nota = readln().toDouble()

          if (nota < 0 || nota > 10)
          println("Erro! Nota inválida.")

        }
        while (nota < 0 || nota > 10)

        soma += nota
    }

    println("A nota média final é ${soma / 6}")
}