
//Example code
 class User(val name : String, val age : Int)
data class DataUser(val name : String, val age : Int)
/*
Konstruktor utama pada kelas tersebut harus memiliki setidaknya satu parameter;

Semua konstruktor utama perlu dideklarasikan sebagai val atau var;

Modifier dari sebuah data class tidak bisa abstract, open, sealed, atau inner.
 */

fun main(){
    val user = User("ego", 15)
    val dataUser = DataUser("ego", 15)

    println(user)
    println(dataUser)
}