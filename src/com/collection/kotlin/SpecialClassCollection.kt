package com.collection.kotlin
//Example code
 class User(val name : String, val age : Int){
    override fun toString(): String{
         return "User(name=$name, age=$age)"
     }
 }

    data class DataUser(val name : String, val age : Int){
        fun intro(){
            println("aku $name, umurku $age")
        }
    }
/*
Konstruktor utama pada kelas tersebut harus memiliki setidaknya satu parameter;

Semua konstruktor utama perlu dideklarasikan sebagai val atau var;

Modifier dari sebuah data class tidak bisa abstract, open, sealed, atau inner.
 */

fun main(){
    val dataUser = DataUser("nrohmen", 17)
    val dataUser4 = dataUser.copy(name="Yogi")
//    println(dataUser4)

//    Descturcting
    val dataUser1 = DataUser("yor", 22)
    dataUser1.intro()
    val name = dataUser1.component1()
    val age = dataUser1.component2()
//    println("My name is $name, i am $age years old")

    val user = User("nrohmen", 17)

//    println(user.equals(user))

}