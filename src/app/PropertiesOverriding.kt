package app

import data.Division
import data.FirstArmy
import data.SecondArmy

fun main(){
    val division = Division()
    println(division.infantry)

    val division2 = FirstArmy()
    println(division2.infantry)

    val division3 = SecondArmy()
    println(division3.infantry)
}