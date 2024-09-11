package com.collection.kotlin

enum class Color(val value: Int) {
//    can use as anonymous class
RED(0xFF0000){
    override fun printValue() {
        println("value of RED is $value")
    }
},
    GREEN(0x00FF00){
        override fun printValue() {
            println("value of GREEN is $value")
        }
    },
    BLUE(0x0000FF){
        override fun printValue() {
            println("value of BLUE is $value")
        }
    };

    abstract fun printValue()
}


fun main(){
    val red: Color = Color.RED
    println(red)
    val colors: Array<Color> = Color.values()
    colors.forEach { colors-> print("$colors") }
}