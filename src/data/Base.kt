package data

interface Base {
    fun hello(name: String)
    fun bye(name: String)
}

class MyBase: Base{
    override fun hello(name: String) {
        println("Hello $name")
    }

    override fun bye(name: String){
        println("Bye $name")
    }
}

// manual delegation
//class Delegate(val base: Base): Base{
//    override fun hello(name: String) {
//        base.hello(name)
//    }
//}

// delegasi otomatis
class MyDelegate(val base: Base): Base by base