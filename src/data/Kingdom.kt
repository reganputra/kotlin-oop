package data

// use open to allow inheritance
// This is Parent class
open class Kingdom (var name: String) {

//    use open to allow function overriding
//    is used to enable child class to create a parent class function
    open fun greeting(name: String){
        println("Greetings ${this.name}, My name is $name")
    }

}
// This is Child class
// every Child inherit both properties and function from parent in this case
open class King(name: String): Kingdom(name) {
//    ovveride implementation
//    you can add final to override function so child class cant create parent function
    override fun greeting(name: String) {
        println("Hello $name, yes, you're right i am ${this.name}")
    }
}


class Queen(name: String): Kingdom(name){
    override fun greeting(name: String) {
        println("Hello $name, yes, you're right i am ${this.name}")
    }
}