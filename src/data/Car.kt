package data

class Car (carBrand: String, carYear: Int = 2014, carColor: String) {

   init {
       println("The $carBrand has been made")
   }

    var brand: String = carBrand
    var year:Int = carYear
    var color: String = carColor
}