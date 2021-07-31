package one.digitalinnovation.collections

fun main() {
    val values = IntArray(size = 5)
    values [0] = 1
    values [1] = 7
    values [2] = 6
    values [3] = 3
    values [4] = 2

    println("\n")
    println("A\n")
    for (valor in values) {
        println(valor)
    }

    println("\n")
    println("B\n")
        values.forEach {
            println(it)
        }

    println("\n")
    println("C\n")
    values.forEach { valor ->
        println(valor)
    }

    println("\n")
    println("D\n")
    for (index in values.indices) {
        println(values  [index])
    }

    println("\n")
    println("E\n")
    values.sort()                       //FOR ORDER THE LIST
    for (valor in values) {
        println(valor)
    }

}