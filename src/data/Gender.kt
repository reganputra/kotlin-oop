package data

enum class Gender(val desc: String) {
    MALE("MAlE"),
    FEMALE("FEMALE");

    //function
    fun showDesc(){
        println(desc)
    }
}