package one.digitalinnovation.collections

fun main() {

    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)

    println("\nA")
    salarios.sort()                       //FOR ORDER THE LIST

    salarios.forEach { println (it) }

    println("\nB")
    println("The Max salary is: ${salarios.maxOrNull()}")
    println("The Min salary is: ${salarios.minOrNull()}")
    println("The Average Salary is: ${salarios.average()}")
    println("The Salaries greater than 2,250.0 is/are: ${salarios.filter {it>2500.0}}")

}
