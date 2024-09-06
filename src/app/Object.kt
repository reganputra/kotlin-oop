package app

import data.Person

fun main(){
    val human = Person()
    human.name = "Regan"
    human.age = 21
    human.country = "Indonesia"

    println(human.name)
    println(human.age)
    println(human.country)
}