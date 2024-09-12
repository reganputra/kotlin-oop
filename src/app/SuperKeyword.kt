package app

import data.FirstArmy
fun main(){
    val superKeyword = FirstArmy()
    println("Infantry ${superKeyword.infantry}")
    println("Parent ${superKeyword.parentArmy}")
    superKeyword.sayDiv()
}