package one.digitalinnovation.collections

fun main() {
    val Josue = funcionary(name = "Josue", salary = 2000.0, ContractType = "CLT")
    val Pedro = funcionary(name = "Pedro", salary = 1500.0, ContractType = "PJ")
    val María = funcionary(name = "María", salary = 4000.0, ContractType = "CLT")

    val funcionaries_1 = setOf( Josue, Pedro)
    val funcionaries_2 = setOf( María)
    val funcionaries_3 = setOf( Josue, Pedro, María)

    println("\nA - Result Union")
    val ResultUnion = funcionaries_1.union(funcionaries_2)
    ResultUnion.forEach { println(it) }

    println("\nB - Result Subtract")
    val ResultSubtract = funcionaries_3.subtract(funcionaries_2)
    ResultSubtract.forEach { println(it) }

    println("\nC - Result Intersect")
    val ResultIntersect = funcionaries_3.intersect(funcionaries_2)
    ResultIntersect.forEach { println(it) }
}