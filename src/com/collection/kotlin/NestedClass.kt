package com.collection.kotlin

class House {
//    outer class properties
    val building = 60
    val totalFamily = 3
//    inner class
    inner class Room {
        val totalFamily = 20
        fun measure(){
//            inner class can access outer class properties
//            println(building/totalFamily)
//            if outer and inner class has a same prop name
            println(building/this@House.totalFamily)

        }
    }
}

fun main() {
    val house = House()
    val room = house.Room()
    room.measure()
}