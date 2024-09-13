package data

// interface is like a blueprint
interface Interact {
    val name: String
    // concrete function
    fun hello(name: String) { // open by default
        println("Hi $name, my name is ${this.name}")
    }
}

// in interface a child clas can have multiple interface parfent
//interface can inherite another interface
interface Go: Interact{
        fun go(){
            println("Go...")
        }
    }

interface MoveA{
    fun move() = println("Move A")
}

interface MoveB{
    fun move() = println("Move B")
}

class Human( override val name: String): Go, MoveA, MoveB{ // Go is another interface
    override fun move() {
        // super keyword
        super<MoveA>.move()
        super<MoveB>.move()
        println("This is move...")
    }
}