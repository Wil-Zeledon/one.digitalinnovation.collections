package one.digitalinnovation.collections

fun main() {

    val salarios = DoubleArray (size = 3)

    salarios [0] = 1000.0
    salarios [1] = 3000.0
    salarios [2] = 500.0

    println("\nA")
    salarios.forEach { println (it) }

    println("\nB")
    salarios.forEachIndexed { index, salario ->
    salarios[index] = salario * 1.1 }
    salarios.forEach { println(it) }

    val salarios2 = doubleArrayOf(1500.0, 1250.0, 5000.0)

    println("\nC")
    salarios2.forEach { println (it) }

    println("\nD")
    salarios2.sort()                       //FOR ORDER THE LIST
    for (salario in salarios2) {
        println(salario)


    }
}