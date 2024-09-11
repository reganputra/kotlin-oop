package com.functional.programing

fun buildString(action: StringBuilder.() -> Unit): String {
    val stringBuilder = StringBuilder()
    stringBuilder.action()
    return stringBuilder.toString()
}

fun main(){
    val buildMessage = buildString {
        append("A")
        append("B")
        append("C")
    }
    println(buildMessage)
}