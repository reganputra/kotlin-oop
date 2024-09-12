package data

abstract class Animal {
   abstract val name: String
    abstract fun run()
}

class Cat: Animal(){
    override val name = "Cat"
    override fun run() {
        println("Run cat")
    }
}
class Dog: Animal(){
    override val name = "Dog"
    override fun run() {
        println("Run dog")
    }
}