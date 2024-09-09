package app

import data.Address
fun main(){
    val address1 = Address("Jalan WHB","Surabaya" )
    val address2 = Address("Jalan A", "Bandung", "Indonesia")

    println(address1.street)
    println(address2.street )
}