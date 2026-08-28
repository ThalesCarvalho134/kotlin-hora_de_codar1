package org.example

fun main(){

    var contagemdentro = 0
    var contagemfora = 0

    print("Primeiro valor: ")
    var s1 = readln().toInt ()
    if(s1>=24 && s1<=42){
        contagemdentro++
    }
    else{
        contagemfora++
    }

    print("Segundo valor: ")
    var s2 = readln().toInt()
    if(s2>=24 && s2<=42){
        contagemdentro++
    }
    else{
        contagemfora++
    }

    print("Terceiro valor: ")
    var s3 = readln().toInt()
    if(s3>=24 && s3<=42){
        contagemdentro++
    }
    else{
        contagemfora++
    }

    print("Quarto valor: ")
    var s4 = readln().toInt()
    if(s4>=24 && s4<=42){
        contagemdentro++
    }
    else{
        contagemfora++
    }

    print("Quinto valor: ")
    var s5 = readln().toInt()
    if(s5>=24 && s5<=42){
        contagemdentro++
    }
    else{
        contagemfora++
    }

    print("Sexto valor: ")
    var s6 = readln().toInt()
    if(s6>=24 && s6<=42){
        contagemdentro++
    }
    else{
        contagemfora++
    }

    print("Sétimo valor: ")
    var s7 = readln().toInt()
    if(s7>=24 && s7<=42){
        contagemdentro++
    }
    else{
        contagemfora++
    }

    print("Oitavo valor: ")
    var s8 = readln().toInt()
    if(s8>=24 && s8<=42){
        contagemdentro++
    }
    else{
        contagemfora++
    }

    print("Nono valor: ")
    var s9 = readln().toInt()
    if(s9>=24 && s9<=42){
        contagemdentro++
    }
    else{
        contagemfora++
    }

    print("Décimo valor: ")
    var s10 = readln().toInt()
    if(s10>=24 && s10<=42){
        contagemdentro++
    }
    else{
        contagemfora++
    }

    println("Há $contagemdentro valores entre o intervalo 24 e 42.")
    println("Há $contagemfora valores fora do intervalo entre 24 e 42.")

}