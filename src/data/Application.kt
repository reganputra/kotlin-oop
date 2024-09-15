package data

class Application(val name: String) {
    object Util{
        fun toLower(name: String): String{
            return name.lowercase()
        }
    }
}