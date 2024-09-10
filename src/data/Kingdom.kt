package data

// use open to allow inheritance
// This is Parent class
open class Kingdom (var name: String) {

    fun greeting(name: String){
        println("Greetings ${this.name}, My name is $name")
    }

}
// This is Child class
// every Child inherit both properties and function from parent in this case
class King(name: String): Kingdom(name)
class Queen(name: String): Kingdom(name)