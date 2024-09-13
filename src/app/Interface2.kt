package app

import data.Human

fun main(){
    val human = Human("Octo")
    //1st interface
    human.hello("Nugi")

    //2nd interface
    human.go()

    human.move()
}