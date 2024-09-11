package com.collection.kotlin

//Singleton
object CentralLibrary {
    fun borrowBookById(id: Int) {
        print("Book with $id has been borrowed")
    }
}

//Companion
class Library {
    companion object{
        fun borrowBookById(id: Int) {
            println("Book with $id has been borrowed")
        }
    }
}

//Anonmy class
interface ITly {
    fun fly()
}

fun flyWithWings(bird: ITly) {
    bird.fly()
}

fun main() {
//    CentralLibrary.borrowBookById(21)
//    Library.Companion.borrowBookById(21)
//    Library.borrowBookById(21)
    flyWithWings(object : ITly {
        override fun fly() {
            println("The Bird flying")
        }
    })
}