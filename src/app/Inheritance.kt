package app

import data.King
import data.Queen

fun main(){
    val king = King("King Richard I")
    king.greeting("Lord Aegon")

    val queen = Queen("Queen Anne")
    queen.greeting("Sir Jamie")
}