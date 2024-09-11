package com.collection.kotlin
/*
Fold
fun main() {
    val numbers = listOf(1, 2, 3)
    val fold = numbers.fold(10) { current, item ->
        println("current $current")
        println("item $item")
        println()
        current + item
    }

    println("Fold result: $fold")
}
 */

/*
Drop
fun main() {
    val number = listOf(1, 2, 3, 4, 5, 6)
    val drop = number.drop(3)

    println(drop)
}
 */
//Drop
fun main() {
    val total = listOf(1, 2, 3, 4, 5, 6)
    val take = total.take(3)

    println(take)

}


