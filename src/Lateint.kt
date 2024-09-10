
lateinit var  name: String
fun main(){
//lateint
    name = "Amba"
    if (::name.isInitialized){
        println(name.length)
    } else println("nope")
}