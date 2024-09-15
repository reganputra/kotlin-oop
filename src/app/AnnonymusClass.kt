package app

import data.Action

fun fireAction(action: Action){
    action.action()
}

fun main(){
//Call annymous class without creating class
    fireAction(object: Action{ // call with 'object' keyword
        override fun action() = println("Act 1")
    })

    fireAction(object: Action{ // call with 'object' keyword
        override fun action() =  println("Act 2")
    })
}