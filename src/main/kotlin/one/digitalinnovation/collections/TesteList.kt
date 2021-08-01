package one.digitalinnovation.collections

import java.nio.file.Files.find

fun main() {
    val Josue = funcionary(name = "Josue", salary = 2000.0, ContractType = "CLT")
    val Pedro = funcionary(name = "Pedro", salary = 1500.0, ContractType = "PJ")
    val María = funcionary(name = "María", salary = 4000.0, ContractType = "CLT")

    val funcionaries = listOf(Josue, Pedro, María)

    println("\n")
    funcionaries.forEach { println(it)}


    println("\n")
    println("The funacionary is:")
    println(funcionaries.find{it.name == "María" })

    println("\n")
    funcionaries.sortedBy { it.salary }.forEach { println (it)}                       //FOR ORDER THE LIST WITH sortedBy

    println("\n")
    funcionaries.groupBy { it.ContractType + "\n"}.forEach { println (it) }              //FOR ORDER THE LIST WITH sortedBy

}


data class funcionary(
    val name: String,
    val salary: Double,
    val ContractType: String

) {

    override fun toString(): String =

    """
        name: $name
        salary: $salary
    """ .trimIndent()


}