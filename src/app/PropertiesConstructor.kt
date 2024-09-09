package app

import data.User

fun main(){
    val user1 = User("bartukham", "wkwkw1")
    val user2 = User("amba", "bushhh")

    user1.password = "69"
    println(user1.username)
    println(user1.password)

    user2.username = "ambasing"
    println(user2.username)
    println(user2.password)
}