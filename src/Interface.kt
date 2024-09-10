interface IFly {
    fun fly()
    val numberOfWings: Int
}

class Bird(override val numberOfWings: Int) : IFly {
    override fun fly() {
        if (numberOfWings > 0) println("flying with $numberOfWings now")
        else println("no wings")
    }
}

fun main(){
    val bird = Bird(2) 
    bird.fly()

    val noWingBird = Bird(0)
    noWingBird.fly()
}