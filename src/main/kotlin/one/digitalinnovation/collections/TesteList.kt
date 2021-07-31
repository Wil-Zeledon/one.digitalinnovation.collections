package one.digitalinnovation.collections

import java.nio.file.Files.find

fun main() {
    val João = funcionary(name = "Josue", salary = 1000.0)
    val Pedro = funcionary(name = "Pedro", salary = 2000.0)
    val María = funcionary(name = "María", salary = 4000.0)

    val funcionaries = listOf(João, Pedro, María)

    println("\n")
    funcionaries.forEach { println(it)}


    println("\n")
    println("The funacionary is:")
    println(funcionaries.find{it.name == "María" })
}


data class funcionary(
    val name: String,
    val salary: Double

) {

    override fun toString(): String =

    """
        name: $name
        salary: $salary
    """ .trimIndent()


}