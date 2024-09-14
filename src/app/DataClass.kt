package app

import data.Product

fun main(){
    val  product1 = Product("Chitato", 5000, "Food")
    println(product1)

    // copy
    val product2 = product1.copy(name = "Popmie")
    println(product2)

}