package app

import data.Minus
import data.Modulo
import data.Operation
import data.Plus

fun operation(value1: Int, value2: Int, operation: Operation): Int{
    //Sealed class sangat berguna saat menggunakan when
    return when(operation){
        is Plus -> value1 + value2
        is Minus -> value1 - value2
        is Modulo -> value1 % value2
    }
}

fun main (){
   val oper1 = operation(20,32, Plus())
    val oper2 = operation(50,32, Minus())
    val oper3 = operation(20,32, Modulo())

    println(oper1)
    println(oper2)
    println(oper3)
}