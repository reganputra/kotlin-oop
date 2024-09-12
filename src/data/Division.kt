package data

open class Division {
//    Properties overriding same concept like function overriding
   open val infantry: Int = 3
    open fun sayDiv(){
        println("This is Division")
    }
}

 class FirstArmy: Division(){
    override val infantry: Int = 4
//    Super keyword, untuk mengakses fungsi atau properties milik parent
    val parentArmy: Int = super.infantry
//     Super function
     override fun sayDiv() {
         println("This is First Army")
//         to print parent function
         super.sayDiv() // "This is Division"
     }
}

class SecondArmy: Division(){
    override val infantry: Int = 5

}