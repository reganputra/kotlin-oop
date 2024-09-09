package app

import data.Person

fun main(){
    val regan = Person()
    regan.name = "Regan Putra Ramadhan"
    regan.age = 21
    regan.country = "Indonesia"

    regan.sayHello("Mika")
    regan.run()
    val fullId = regan.fullId()
    println(fullId)
}
