package data

class Note(title: String) {
    var title: String = title
        get()  {
            println("This is getter")
            return field
        }
        set(value)  {
            println("This is setter")
            if (value.isNotBlank()){
                field = value
            }
        }
}

    class BigNote(val title: String){
        val bigTitle: String
            get() = title.uppercase()
    }