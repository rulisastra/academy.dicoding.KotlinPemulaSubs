// main function
fun main() {
    val nama = setUser("Alfian", 19)
    println(nama) // "nama" tadinya "user"

    printUser("Alfian")
}

fun setUser(name: String, age: Int) = "Your name is $name, and you $age years old"

fun printUser(name: String) {
    println("Your name is $name")
}