package app

import data.Gender

fun main (){
    // call enum class
    val man = Gender.MALE
    val woeman = Gender.FEMALE

    // Call all enum data
    val callAll: Array<Gender> = Gender.values()

    //konversi data
    val manFromString = Gender.valueOf("MALE")

    println(man)
    println(woeman)
    println(callAll.toList())

    man.showDesc()
    woeman.showDesc()
}