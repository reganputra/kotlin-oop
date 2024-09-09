package app
import data.Person

fun main(){
    val regan = Person()
    regan.name = "Regan"

    regan.sayHello("Miyamoto")
    regan.sayHello("Aji", "Saka")
}