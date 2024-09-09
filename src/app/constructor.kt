package app

import data.Car
fun main(){
    val honda = Car("Honda")
    honda.year = 2019
//    println(honda.year)
//    println(honda.color)

    val toyota = Car("Yaris", "Babi")
//    println(toyota.year)
//    println(toyota.color)
    println(honda.brand)
    println(honda.year)
    println(toyota.brand)
    println(toyota.year)
}
