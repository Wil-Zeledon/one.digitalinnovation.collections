package one.digitalinnovation.collections

fun main() {
    val pair: Pair<String, Double> = Pair("Josue", 1000.0)
    val map1 = mapOf(pair)
    val map2 = mapOf(
        "Pedro" to 2500.0,
        "María" to 3000.0
    )

    println("\nA - PAIR")
    map1.forEach { (k, v) -> println("Chave: $k - valor: $v")}

    println("\nB - SYNTAXIS")
    map2.forEach { (k, v) -> println("Chave: $k - valor: $v")}
}