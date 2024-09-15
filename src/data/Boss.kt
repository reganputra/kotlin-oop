package data

class Boss(val bossName: String) {

    inner class Employee(val name: String){
        fun hi(){
            println("Hi i am $name, my boss is ${this@Boss.bossName}")
        }
    }
}