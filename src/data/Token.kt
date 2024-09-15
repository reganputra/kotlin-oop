package data

//hanya bisa memiliki 1 param
inline class Token (val name: String){
    fun toUpper() = name.uppercase()
}