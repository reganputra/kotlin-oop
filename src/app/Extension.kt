//class NewInt : Int(){
//    fun printInt(){
//        println("value $this")
//    }
//
//}
fun Int.printInt() {
    print("value $this")
}

fun main() {
    10.printInt()
}