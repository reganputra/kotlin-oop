package app

import data.Student
import data.sayHi
import data.upperName


fun main (){
    val student: Student? =  Student("Regan", 21)
    student.sayHi("Agus")
    println(student?.upperName)
}