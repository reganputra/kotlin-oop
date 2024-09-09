package data

// Tanpa primary constructor
class Address {
//    Hanya bisa di akses bila ada primary constructor
    var street: String = ""
    var city: String = ""
    var country: String = "Indonesia"

//    Secondary Constructor
    constructor(paramStreet: String, paramCity: String ){
        println("A")
        street = paramStreet
        city = paramCity
    }

    constructor(paramStreet: String, paramCity: String, paramCountry:String):this(paramStreet, paramCity){
        country = paramCountry
    }
}