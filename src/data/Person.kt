package data

class Person {
    var name: String = ""
    var age: Int? = null
    var yourName: String = ""
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

//    Function overloading, membuat nama fungsi yg sama tetapi param,tipe data harus beda
    fun sayHello(firstName: String,lastName:String){
    println("Hello $firstName $lastName , My name is $name")
}

//    this keyword
    fun gitGud(yourName: String, name: String){
        println(" Hello $yourName, my name is ${this.name} ")
    }
}

