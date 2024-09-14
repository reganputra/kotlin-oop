package data

class Student(val name: String, val age: Int)

// Extension Function
fun Student?.sayHi(name: String){
    // Nullabel Extension
    if (this != null){
        println("Hello $name, my name is ${this.name} and i am ${this.age} years old")
    }
}

val Student.upperName: String
    get() = this.upperName.uppercase()