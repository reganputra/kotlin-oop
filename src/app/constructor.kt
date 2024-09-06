package app

import data.Car
fun main(){
    val honda = Car("Honda", 2003, "Black")
//    honda.brand = "Daihatsu"
    println(honda.brand)
    println(honda.year)
    println(honda.color)

    val toyota = Car("Yaris", 2002,"White")
    println(toyota.brand)
    println(toyota.year)
    println(toyota.color)
}