package org.example

fun main() {

    var aprovado = 0

    do {
        print("Digite a primeira nota: ")
        var n1 = readln().toInt()
        print("Digite a segunda nota: ")
        var n2 = readln().toInt()
        var m = ((n1 + n2) / 2)

        if (m >= 9.5) {
            println("Aprovado!")
            aprovado++
        }
        else {
            println("Reprovado!")
        }

        print("Calcular a média de outro aluno? (S/N)")
        var s_ou_n = readln()
    }
    while (s_ou_n == "s" || s_ou_n == "S")

    println("Quantidade de alunos aprovados: $aprovado")
}