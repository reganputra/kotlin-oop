package data

//sangat cocok digunakan sebagai parent class
sealed class Operation(val name: String) // sealed class didesain untuk inheritance

class Plus: Operation("Plus")
class Minus: Operation("Minus")
class Modulo: Operation("Modulo")