package app

import data.Boss

fun main(){
    // untuk memanggil innerclass harus membuat object outer class dulu
    val boss1 = Boss("Hadi")
    val staff1 = boss1.Employee("Dedek")

    staff1.hi()

}