package app

import data.Base

import data.MyBase
import data.MyDelegate

fun main(){
    val base = MyBase()
    base.hello("Kimi")

    // memanggil delegation
    val delegate = MyDelegate(base)
    delegate.hello("Naru")
    delegate.bye("Horus")

}