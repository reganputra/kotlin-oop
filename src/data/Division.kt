package data

open class Division {
//    Properties overriding same concept like function overriding
   open val infantry: Int = 3
}

class FirstArmy: Division(){
    override val infantry: Int = 4
}

class SecondArmy: Division(){
    override val infantry: Int = 5

}