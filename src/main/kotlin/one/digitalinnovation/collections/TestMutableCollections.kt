package one.digitalinnovation.collections

fun main() {
    val Josue = funcionary(name = "Josue", salary = 2000.0, ContractType = "CLT")
    val Pedro = funcionary(name = "Pedro", salary = 1500.0, ContractType = "PJ")
    val María = funcionary(name = "María", salary = 4000.0, ContractType = "CLT")

    val funcionaries = mutableListOf(Josue, María)
    val funcionariesSet = mutableListOf(Josue)

    println("\nA - Mutable List")
    funcionaries.forEach { println(it)}

    println("\nB - ADD")
    funcionaries.add(Pedro)
    funcionaries.forEach { println(it)}

    println("\nC - REMOVE")
    funcionaries.remove(Josue)
    funcionaries.forEach { println(it)}

    println("\nD - Mutable ListSET")
    funcionariesSet.forEach { println(it)}          // PRINT BEFORE LINES, THE SET DON´T PERMIT REPEAT AFTER THIS LINE.

    println("\nE - SET.ADD ")
    funcionariesSet.add(Pedro)
    funcionariesSet.add(María)
    funcionariesSet.forEach { println(it)}

    println("\nF - SET.REMOVE")
    funcionariesSet.remove(María)
    funcionariesSet.forEach { println(it)}
}