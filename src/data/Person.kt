package data

class Person {
    var name: String = ""
    var age: Int? = null
    var country: String = ""

//    Function in class
    fun sayHello(yourName: String){
        println("Hello $yourName, My name is $name")
    }

    fun run(){
        println("I'm running....")
    }

    fun fullId():String {
        return "$name $age $country"
    }
}

