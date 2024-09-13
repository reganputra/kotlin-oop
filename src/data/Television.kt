package data

class Television {
//    lateinit digunakan jika ingin medeklarsikan propeties tanpa nilai
    lateinit var brand: String

    fun thisIsTV(brand: String){
        this.brand = brand
    }
}