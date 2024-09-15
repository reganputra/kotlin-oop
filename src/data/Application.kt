package data

class Application(val name: String) {
   companion object { // companion object
        fun toLower(name: String): String{
            return name.lowercase()
        }
    }
}