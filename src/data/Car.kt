package data

// Primary Constructor
class Car (carBrand: String, carName: String, carYear: Int  ) {

//    Intializer Block
   init {
       println("The $carBrand has been made")
   }

//    Secondary Contructor
    constructor(carBrand: String, carName: String): this(carBrand, carName, 2024){
    println("Secondary Contructor 1")
    }

    constructor(carBrand: String): this(carBrand, "") {
        println("Secondary Contructor 2")
    }
//    Hanya bisa di akses bila ada primary constructor
    var brand: String = carBrand
    var year:Int = carYear
    var name: String = carName
}