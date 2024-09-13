
interface IFly {
    //default value not allowed
    fun fly()//must be overridden
    val numberOfWings: Int//must be overridden
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


