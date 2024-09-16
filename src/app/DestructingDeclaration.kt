package app

import data.Game
import data.Login
import data.MinMax

// Desctructing in function
fun minMax(value1: Int, value2: Int): MinMax{
    return when{
        value1 > value2 -> MinMax(value2, value2)
        else -> MinMax(value1, value2)
    }
}

// destructing in lambda
fun login(login: Login, callback: (Login) -> Boolean): Boolean{
    return callback(login)
}

fun main(){
    val games = Game("HSR", 2500)

    // desctructing
    val (name, price) = games
    println(name)
    println(price)

    //desctructing function
    val (min, max) = minMax(10, 11)
    println(min)
    println(max)

    //use underscore for unwanted variable
    val (max1, _) = minMax(22,32)
    println(max1)

    //destructing lambda
    val login = Login("akang", "69")
    login(login){ (username, password) ->
        username == "akang" && password == "69"

    }
}