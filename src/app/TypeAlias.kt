package app

import data.Application

// berguna mempersingkat nama class yang panjang
typealias App = Application

// fungsi lambda with type alias
fun hello(supplier: StringSuplier){
    println("Hello ${supplier()}")
}

typealias StringSuplier = () -> String

fun main (){
    val app = App("kotlin")
    println(app.name)

    hello { "joko" }
}