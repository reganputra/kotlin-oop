package data

open class Teacher( val name: String) {
    private fun teach(){
        println("Teach!")
    }

    // protected can used within inheritance class
    protected fun sayHi(){
        println("Hi!")
    }
}

class SuperTeacher(name: String): Teacher(name){

    fun tes(){
        super.sayHi()
    }
}